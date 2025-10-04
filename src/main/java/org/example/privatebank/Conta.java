package org.example.privatebank;

public class Conta {
	protected String titular;
	protected String numero;
	protected double saldo;

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor; // this.saldo = this.saldo + valor;
			System.out.println("Depósito realizado!");
		}
	}

	public boolean sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor; // this.saldo = this.saldo - valor;
			return true;
		}

		return false;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String newTitular) {
		this.titular = newTitular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
