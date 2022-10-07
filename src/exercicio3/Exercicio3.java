package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Qual o seu nome? ");
		student.name = sc.nextLine();
		System.out.println("Digite a Nota 1: ");
		student.nota1 = sc.nextDouble();
		System.out.println("Digite a Nota 2: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Digite a Nota 3: ");
		student.nota3= sc.nextDouble();
		
		student.verificarResultado();
		
		
		sc.close();
	}
}
