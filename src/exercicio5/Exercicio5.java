package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine(); //usei para preencher o espaço vazio do scanner numerico da linha de cima.
		System.out.println("Enter account holder: ");
		String nomeTitular = sc.nextLine();	
		
		System.out.println("Is there a initial deposit (y/n)? ");
		char fazerDepositoInicial = sc.next().charAt(0);
		double depositoInicial = 0;
		if (fazerDepositoInicial == 'y') {
			System.out.println("Enter initial deposit value: ");
			depositoInicial = sc.nextDouble();
		} 
		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
		
		System.out.printf("Account data:\nAccount %d, Holder: %s, Balance: $ %.2f%n%n", contaBancaria.getNumeroConta(), contaBancaria.getNomeTitular(), contaBancaria.consultarSaldo());
		
		System.out.println("Enter a deposit value: ");
		contaBancaria.depositar(sc.nextDouble());
		System.out.printf("Account data:\nAccount %d, Holder: %s, Balance: $ %.2f%n%n", contaBancaria.getNumeroConta(), contaBancaria.getNomeTitular(), contaBancaria.consultarSaldo());
		
		System.out.println("Enter a withdraw value: ");
		contaBancaria.sacar(sc.nextDouble());
		System.out.printf("Account data:\nAccount %d, Holder: %s, Balance: $ %.2f%n%n", contaBancaria.getNumeroConta(), contaBancaria.getNomeTitular(), contaBancaria.consultarSaldo());
		
		
		
		sc.close();
	}
}
