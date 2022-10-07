package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 Rectangle x = new Rectangle();
		 
		 System.out.println("Enter rectangle width and heigth: ");
		 x.width = sc.nextDouble();
		 x.heigth = sc.nextDouble();
		 
		 System.out.printf("AREA =  %.2f%n", x.area());
		 System.out.printf("PERIMETER =  %.2f%n", x.perimeter());
		 System.out.printf("DIAGONAL =  %.2f", x.diagonal());
				
				
		sc.close();
	}

}
