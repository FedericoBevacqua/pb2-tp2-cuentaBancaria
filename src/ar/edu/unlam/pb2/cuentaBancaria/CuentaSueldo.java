package ar.edu.unlam.pb2.cuentaBancaria;

public class CuentaSueldo extends CuentaBancaria {

	public CuentaSueldo() {
		super();
	}

	public void extraer(Double montoAExtraer) throws RuntimeException {
		Double saldo = this.getSaldo();

		if (saldo >= montoAExtraer) {
			Double nuevoSaldo = saldo - montoAExtraer;
			this.setSaldo(nuevoSaldo);
		} else {
			throw new RuntimeException();
		}
	}

}
