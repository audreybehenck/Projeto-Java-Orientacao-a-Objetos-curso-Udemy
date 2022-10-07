package exercicio2;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double l = grossSalary - tax;
		return l;
	}
	
	public void increasySalary(double percentage) {
		double aumentoSalario = (grossSalary * percentage) / 100;
		grossSalary += aumentoSalario;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", grossSalary=" + grossSalary + ", tax=" + tax + "]";
	}
	
	
}
