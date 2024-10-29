package br.com.caelum.exercicios;

public class Produto {
	public String nome;
	public int quantidade;
	public double preco;
	public String modelo;
	
	public Produto(String nome, int quantidade, double preco, String modelo ) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.modelo = modelo;
		
		
	}
	
	
	public void adicionaEstoque(int quantidade) {
		this.quantidade += quantidade;	
		}
	
	public void removerEstoque(int quantidade) {
		if(this.quantidade>= quantidade) {
			this.quantidade -= quantidade;
		}else {
			System.out.println("Quantidade insuficiente em estoque!");
		}
		
		
		}
	
	public double  calculaEstoque() {
		return this.quantidade*quantidade;	
		}
	
	
	/*Exibir as informaçoes do produto
	 * Use a função;System.out.print()
	 * Acesse as variaveis de classe: this.
	 */
	public void exibirInfo() {
	System.out.println("produto:" + this.nome);
	System.out.println("quantidade:" + this.quantidade);
	System.out.println("preco:" + this.preco);
	
	}
}




	
	
	
	



