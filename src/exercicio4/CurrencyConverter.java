package exercicio4;

public class CurrencyConverter {
	
	public double precoDolar;
	public double valorEmDolar;
	
	
	public double conversao() {
		double conversao = precoDolar * valorEmDolar;
		return (conversao);
	}
	
	public double valorComImposto() {
		double conversao =  conversao();
		double valorComImposto = conversao * 0.06;
		return (valorComImposto + conversao);
	}
	
	
}
