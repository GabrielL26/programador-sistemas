package model;

public class Gato implements Animal {

	private String nome;

	public Gato(String nome) {
		this.nome = nome;
	}


	public String seuNome() {

		return nome;
	}

	
	public String seuBarulho() {

		return "Miau! Miau!";
	}

}
