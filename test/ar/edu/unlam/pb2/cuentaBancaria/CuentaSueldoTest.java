package ar.edu.unlam.pb2.cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CuentaSueldoTest {

	@Test
	public void extraer() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(4000.0);

		cuenta.extraer(500.0);
		Double saldo = cuenta.getSaldo();

		Assert.assertEquals(3500.0, saldo);
	}

	@Test
	public void saldoInsuficiente() {
		CuentaSueldo cuenta = new CuentaSueldo();
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
