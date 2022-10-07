package exercicio3;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2; 
	public double nota3;
	
	public double notaFinal() {
		double notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}
	
	public void verificarResultado() {
		double notaFinal = notaFinal();
		if (notaFinal >= 60) {
			String aprovado = "PASS";
			System.out.printf("FINAL GRADE = %.2f%n%s%n", notaFinal(), aprovado);
			
		}
		else {
			String reprovado = "FAILED\n";
			double diferenca = calcularDiferenca();
			System.out.printf("FINAL GRADE = %.2f%n%sMISSING %.2f POINTS", notaFinal(), reprovado, diferenca);
		}	
	}
	
	public double calcularDiferenca() {
		double notaFinal = notaFinal();
		double diferenca = 60 - notaFinal;
		return diferenca;
	}
}
