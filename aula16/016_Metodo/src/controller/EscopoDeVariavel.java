package controller;

public class EscopoDeVariavel {
	
	static int x = 2; //vari�vel global
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("x no in�cio de main() � " + x);
		metodoA();
		metodoB();
	}
	
	public static void metodoA() {
		int x = 25;
		System.out.println("Vari�vel local x ao entrar no metodoA � " + x);
		x = x + 1;
		System.out.println("Vari�vel local x antes de sair do metodoA � " + x);
	}
	
	public static void metodoB() {
		System.out.println("vari�vel x ao entrar no metodoB � " + x + " global.");
		x = x*10;
		System.out.println("vari�vel x antes de sair do metodoB � " + x);
	}

}
