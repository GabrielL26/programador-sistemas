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
	    	       System.out.println("Iniciando método 1");
	    	       segundo();
	    	       System.out.println("terminando método 1");
         }
	     public static void segundo() {
	    	       System.out.println("Iniciando método 2");
	    	       System.out.println("Terminando método 2");	  
         }
	     public static void terceiro() {
	    	       System.out.println("iniciando método 3");
	    	       System.out.println("Terminando método 3");
         }
}
