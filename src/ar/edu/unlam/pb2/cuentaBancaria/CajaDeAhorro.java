package ar.edu.unlam.pb2.cuentaBancaria;

public class CajaDeAhorro extends CuentaBancaria {

	private final Double comisionExtraccion = 6D;
	private final Integer intervaloComision = 5;

	public CajaDeAhorro() {
		super();
	}

	public void extraer(Double monto) throws RuntimeException {
		Double dineroExtraer = monto;

		if ((this.getCantidadExtracciones() + 1) % this.intervaloComision == 0) {
			dineroExtraer += this.comisionExtraccion;
		}

		Double saldoActual = this.getSaldo();
		if (saldoActual >= dineroExtraer) {
			this.setSaldo(saldoActual - dineroExtraer);

			Integer cantidadActualExtracciones = this.getCantidadExtracciones();
			this.setCantidadExtracciones(cantidadActualExtracciones + 1);
		} else {
			throw new RuntimeException();
		}
	}

}
