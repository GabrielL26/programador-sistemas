package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");
		
		int nota1, nota2, nota3, nota4, mediaFinal;
		nota1 = Teclado.lerInt("Digite sua Primeira Nota: ");
		
		nota2 = Teclado.lerInt("Digite sua Segunda Nota: ");
		
		nota3 = Teclado.lerInt("Digite sua Terceira Nota: ");
		
		nota4 = Teclado.lerInt("Digite sua Quarta Nota: ");
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Nome Informado: " + nome);
		System.out.println("Primeira Nota: " + nota1);
		System.out.println("Segunda Nota: " + nota2);
		System.out.println("Terceira Nota: " + nota3);
		System.out.println("Quarta Nota: " + nota4);
		System.out.println("Média Final: " + mediaFinal);

	}

}
