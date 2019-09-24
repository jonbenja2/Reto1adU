package src.main.java.Reto1adU;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LectorDatosPorTeclado {
	private static Scanner scan;
	
	public static void main(String[] args) {
	//Declaracion de variables	
	
	  LectorDeAlfabetico();
     
	}
	public static boolean LectorDeAlfabetico() {
		
			scan = new Scanner(System.in);
	        System.out.print("Introduce texto: ");
	        String input = scan.nextLine();
	        boolean alfa = Pattern.matches("^[a-zA-Z0-9]*$", input);
	        // Si son solo letras imprime "Alfabetico" si no imprime "No Alfabetico"
	        System.out.println(alfa ? "Alfanumerico" : "No Alfanumerico"); 
	        return alfa;
	    
	}
		
		
}
