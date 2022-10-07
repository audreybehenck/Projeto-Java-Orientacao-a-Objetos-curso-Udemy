package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println("Name: " + employee.name);
		System.out.printf("Gross Salary: %.2f%n", employee.grossSalary);
		System.out.printf("Tax: %.2f%n%n", employee.tax);
		
		System.out.printf("Employee: %s, $ %.2f%n%n", employee.name, employee.netSalary());
		
		System.out.println("Wich percetage to increase salary? " + "\n");
		double percetage = sc.nextDouble();
		
		employee.increasySalary (percetage);
		
		
		System.out.printf("Update data: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		sc.close();
	}
}
