package LectorLinux;
import java.util.Scanner;
import java.util.regex.Pattern;  
public class LectorLinux {
	
	public static void main(String[] args) {
		       Scanner scan = new Scanner(System.in);

		        System.out.print("Introduce texto: ");
		        String input = scan.nextLine();
		        boolean alfa = Pattern.matches("^[a-zA-Z0-9]*$", input);
		        // Si son solo letras imprime "Alfabetico" si no imprime "No Alfabetico"
		        System.out.println(alfa ? "Alfanumerico" : "No Alfanumerico"); 
		    }
		}
		



