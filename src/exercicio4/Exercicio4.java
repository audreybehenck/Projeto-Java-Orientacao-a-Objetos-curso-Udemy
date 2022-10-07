package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		currencyConverter.precoDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		currencyConverter.valorEmDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", currencyConverter.valorComImposto());
		
		
		
		
		sc.close();
	}
}
