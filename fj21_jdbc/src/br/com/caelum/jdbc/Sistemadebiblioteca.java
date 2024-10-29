package br.com.caelum.jdbc;

public class Sistemadebiblioteca {
	private String titulo;
	private String autor;
    private boolean emprestado;
    
    public Sistemadebiblioteca(String titulo,String autor) {
    	  this.titulo=titulo;
    	  this.autor=autor;
    	  this.emprestado=false;
    	  	  
    }
     
    public void emprestar() {
    	if(!emprestado) {
    	System.out.println("Livro Disponível");
    	emprestado = true;
    	}else {
    		System.out.println("Livro emprestado");
    	}
    	
    }
    	
    public void devolver() {
    	if(emprestado) {
    		emprestado = false;
    		System.out.println("Livro devolvido com sucesso.");
    	}else {
    		System.out.println("Livro ja está na biblioteca");
    	}
    	
    	
    }	
    
    public void verificarDisponibilidade() {
    	
    }
    
    	
    }
	


