package model;

public class Cachorro implements Animal {

	private String nome;

	public Cachorro(String nome) {
		this.nome = nome;
	}

	
	public String seuNome() {

		return nome;
	}

	
	public String seuBarulho() {

		return "Au! Au!";
	}

}
