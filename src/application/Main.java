package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.println("Número da Conta: ");
		int numero = sc.nextInt();
		System.out.println("Titular da Conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Deseja fazer um deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's'){
			System.out.println("Digite um valor para deposito: ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numero, titular, depositoInicial);
		}
		else {
			conta = new ContaBancaria(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do deposito: ");
		double depositarvalor = sc.nextDouble();
		conta.depositar(depositarvalor);
		System.out.println("Dados da Conta Atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor de saque: ");
		double sacarvalor = sc.nextDouble();
		conta.sacar(sacarvalor);
		System.out.println("Dados da Conta Atualizados: ");
		System.out.println(conta);
		
		sc.close();

	}

}
