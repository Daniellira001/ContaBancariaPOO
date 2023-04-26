package entities;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	public ContaBancaria(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}
	public ContaBancaria(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		depositar(depositoInicial);
	}
	public int getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		saldo -= valor + 5.00;
}
	public String toString() {
		return "Conta: " 
				+ numero + ", Titular: " 
				+ titular 
				+ ", saldo: $" 
				+ String.format("%.2f", saldo);
	}
}
