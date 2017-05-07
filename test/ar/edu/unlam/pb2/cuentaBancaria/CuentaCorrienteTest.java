package ar.edu.unlam.pb2.cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CuentaCorrienteTest {

	@Test
	public void extraer() {
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.depositar(100.0);

		cuenta.extraer(200.0);
		Double saldo = cuenta.getSaldo();
		Double saldoEsperado = (100 - 200) * 1.05;

		Assert.assertEquals(saldoEsperado, saldo);

	}

	@Test
	public void saldoInsuficiente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.depositar(500D);

		boolean saldoInsuficiente = false;
		try {
			cuenta.extraer(4000.0);
		} catch (RuntimeException e) {
			saldoInsuficiente = true;
		}
		Assert.assertEquals(true, saldoInsuficiente);
	}

}
