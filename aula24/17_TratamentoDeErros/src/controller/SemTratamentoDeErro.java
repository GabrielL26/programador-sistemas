package controller;

import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
		int count = 0;
		int maxTries = 3;
		while (true) {
			
	try {
		double a = Teclado.lerDouble("Digite o Numerador: ");
		double b = Teclado.lerDouble("Digite o Denominador: ");
		double c = a/b;
		System.out.println("Resultado da divisão de a por b: " + c);
		System.exit(0);
	
	} catch (NumberFormatException nfe) {
		System.out.println("Caracter inválido! ");
		if (++count == maxTries) {
			//throw nfe;
			System.out.println("Número de tentativa excedido");
			System.exit(1);
		}else {
			continue;
		}
      }
	catch (ArithmeticException ae) {
		System.out.println("Divisão por zero");
	}
   }
  }
}
