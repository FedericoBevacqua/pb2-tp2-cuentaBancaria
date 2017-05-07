package ar.edu.unlam.pb2.cuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {

	private final Double porcentajeComision = 0.05D;
	private final Double giroDescubiertoPermitido = 150D;

	public CuentaCorriente() {
		super();
	}

	public Double getPorcentajeComision() {
		return porcentajeComision;
	}

	public Double getGiroDescubiertoPermitido() {
		return giroDescubiertoPermitido;
	}

	public void extraer(Double monto) throws RuntimeException {
		Double dineroExtraer = monto;
		Double saldoActual = this.getSaldo();
		Double giroDescubiertoPermitido = this.getGiroDescubiertoPermitido();

		if (saldoActual >= dineroExtraer) {
			this.setSaldo(saldoActual - dineroExtraer);
		} else if ((saldoActual + giroDescubiertoPermitido) >= dineroExtraer) {
			Double comision = (dineroExtraer - saldoActual) * porcentajeComision;

			this.setSaldo(saldoActual - dineroExtraer - comision);
		} else {
			throw new RuntimeException();
		}
	}
}
