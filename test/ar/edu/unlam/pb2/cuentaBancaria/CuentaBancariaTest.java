package ar.edu.unlam.pb2.cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CuentaBancariaTest {

	@Test
	public void depositar() {
		CajaDeAhorro cuenta = new CajaDeAhorro();
		cuenta.depositar(4000.0);

		Double saldo = cuenta.getSaldo();
		Assert.assertEquals(4000.0, saldo);
	}

}
