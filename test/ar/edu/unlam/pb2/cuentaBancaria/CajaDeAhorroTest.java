package ar.edu.unlam.pb2.cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CajaDeAhorroTest {

	@Test
	public void extraer() {
		CajaDeAhorro cuenta = new CajaDeAhorro();
		cuenta.depositar(4000.0);

		cuenta.extraer(500.0);
		Double saldo = cuenta.getSaldo();

		Assert.assertEquals(3500.0, saldo);

		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);

		cuenta.extraer(100.0);
		saldo = cuenta.getSaldo();

		Double saldoEsperado = 2994D;
		Assert.assertEquals(saldoEsperado, saldo);

	}

	@Test
	public void saldoInsuficiente() {
		CajaDeAhorro cuenta = new CajaDeAhorro();
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
