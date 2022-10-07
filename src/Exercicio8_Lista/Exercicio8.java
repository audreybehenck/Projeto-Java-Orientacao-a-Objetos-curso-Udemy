package Exercicio8_Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários serão registrados?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Funcionário #"+ (i+1) +": ");
			sc.nextLine();
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			boolean jaExiste = false;
			for (int j=0; j<list.size(); j++) { 
				Funcionario funcionarioDaLista = list.get(j);
				if (funcionarioDaLista.getId() == id) {
					jaExiste = true;
					continue;
				}
			}
			if (jaExiste) {
				i--;
				continue;
			}
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();
			System.out.println();
			list.add(new Funcionario(id, nome, salario));
			
			
			
		}	
		
		System.out.println("Informe o Id do funcionário que terá aumento salarial: ");
		int idAumento = sc.nextInt();
		for (int i=0; i<list.size(); i++) { 
			Funcionario funcionarioDaLista = list.get(i);
			if (funcionarioDaLista.getId() == idAumento) {
				System.out.println("Digite a porcentagem: ");
				double porcentagem = sc.nextDouble();
				funcionarioDaLista.aumentarSalario(porcentagem);
				break;
			}
			else if (i == list.size() -1) {
				System.out.println("Este Id não existe!\n");
			}
		}
		System.out.println("Lista de Funcionários: ");
		for (Funcionario x : list) {
			System.out.println(x);
		}
	sc.close();
	}
}
