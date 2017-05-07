package ar.edu.unlam.pb2.cuentaBancaria;

public class CuentaBancaria {
	private Double saldo;
	private Integer cantidadExtracciones;

	public CuentaBancaria() {
		super();
		this.saldo = 0D;
		this.cantidadExtracciones = 0;
	}

	public void depositar(Double monto) {
		Double saldoActual = this.getSaldo();
		this.setSaldo(saldoActual + monto);
	}

	public Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getCantidadExtracciones() {
		return cantidadExtracciones;
	}

	protected void setCantidadExtracciones(Integer cantidadExtracciones) {
		this.cantidadExtracciones = cantidadExtracciones;
	}

}
