package exercicio5;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
			this.numeroConta = numeroConta;
			this.nomeTitular = nomeTitular;
			this.saldo = depositoInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}	
	
	 public void depositar(double valorDeposito) {
		 saldo += valorDeposito;	
	}
	 
	 public void sacar (double valorSaque) {
		 saldo -= (valorSaque + 5);
	 }
	 
	 public double consultarSaldo () {
		 return saldo;
	 }
}
