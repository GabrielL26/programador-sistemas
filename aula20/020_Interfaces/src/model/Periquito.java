package model;

public class Periquito implements Animal {

	private String nome;

	public Periquito(String nome) {
		this.nome = nome;
	}


	public String seuNome() {

		return nome;
	}

	
	public String seuBarulho() {

		return "Piu! Piu!";
	}

}
