package org.example.privatebank;

public class ContaCorrente extends Conta {
	private double taxaSaque = 2.50;

	@Override
	public boolean sacar(double valor) {
		double valorTotal = valor + taxaSaque;

		if (valorTotal <= this.saldo) {
			this.saldo -= valorTotal;
			System.out.println("Saque realizado! Taxa: R$ " + taxaSaque);
			return true;
		}

		return false;
	}
}
