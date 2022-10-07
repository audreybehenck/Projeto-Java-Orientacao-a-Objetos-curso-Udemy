package exercicio6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextByte();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
			System.out.printf("%d%n", vect[i]);
			}
		}
		sc.close();
	}
}