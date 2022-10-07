package exercicio1;

public class Rectangle {
	
	
	public double width;
	public double heigth;
	
	public double area() {
		double a = width * heigth;
		return a;
	}
	
	public double perimeter() {
		double p = (width * 2) + (heigth * 2);
		return p;
	}
	
	public double diagonal() {
		double d = (width * width) + (heigth * heigth);
		return Math.sqrt (d);
	}
	
	@Override
	public String toString() {
		return "Rectangle [Width=" + width + ", Heigth=" + heigth + "]";
	}

}
