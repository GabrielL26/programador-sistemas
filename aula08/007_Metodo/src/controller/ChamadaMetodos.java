package controller;

public class ChamadaMetodos {
	     public static void main(String[] args) {
	               System.out.println("Iniciando Programa");
	               primeiro();
	               System.out.println("Continuando Programa");
	               terceiro();
	               System.out.println("terminando Programa");               
         }
	     public static void primeiro() {
	    	       System.out.println("Iniciando m�todo 1");
	    	       segundo();
	    	       System.out.println("terminando m�todo 1");
         }
	     public static void segundo() {
	    	       System.out.println("Iniciando m�todo 2");
	    	       System.out.println("Terminando m�todo 2");	  
         }
	     public static void terceiro() {
	    	       System.out.println("iniciando m�todo 3");
	    	       System.out.println("Terminando m�todo 3");
         }
}
