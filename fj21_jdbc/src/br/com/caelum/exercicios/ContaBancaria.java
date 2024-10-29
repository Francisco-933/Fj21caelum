package br.com.caelum.exercicios;


public class ContaBancaria {
	
	public String titular;
	public int numero;
	public double saldo;
	
	
	public ContaBancaria(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	    public void depositar(double saldo) {
	        if (saldo > 0) this.saldo += saldo;
	    }

	    public void sacar(double valor) {
	        if (valor > 0 && saldo >= valor) this.saldo -= valor;
	    }

	    public void consultarSaldo() {
	        System.out.println("Saldo atual: R$" + this.saldo);
	    }
	
	
	
	
	
}

	

