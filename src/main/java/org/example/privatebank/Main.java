package org.example.privatebank;

public class Main {
	public static void main(String[] args) {

		Conta conta1 = new ContaCorrente();
		conta1.setTitular("Rodrigo");
		conta1.setNumero("123456-6");

		System.out.println("Titular: " + conta1.getTitular());
		conta1.depositar(800_000_000.05);
		conta1.sacar(1_000);
		System.out.println("Saldo da conta: " +  conta1.getSaldo());


		Conta conta2 = new ContaPoupanca();
		conta2.setTitular("Alexandre");
		conta2.setNumero("125689-6");

		System.out.println("Titular: " + conta2.getTitular());
		conta2.depositar(800_000.05);
		conta2.sacar(1_000.05);
		System.out.println("Saldo da conta: " +  conta2.getSaldo());

	}
}
