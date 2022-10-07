package exercicio7_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Digite os dados da "+ (i+1) +"a pessoa: ");
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		double alturas = 0;
				for (int i=0; i<vetor.length; i++) {
				alturas += vetor[i].getAltura();
				}
				
		double mediaAlturas = alturas / vetor.length;
		
		System.out.printf("Altura média: %.2f%n", mediaAlturas);
		
		int menor16Anos = 0;
				for (int i=0; i<vetor.length; i++) {
					if (vetor[i].getIdade() < 16) {
						menor16Anos +=1;
					}
				}
				
		double porcentagem = (menor16Anos * 100) / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		 
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		sc.close();
	}
}
