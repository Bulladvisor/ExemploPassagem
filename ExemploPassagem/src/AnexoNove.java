import java.util.Scanner;

public class AnexoNove {
	
	/*
	 * O método java.util.Scanner.hasNextLine ()
	 *  retorna true se há uma outra linha na entrada deste scanner.
	 *   Este método pode bloquear enquanto aguarda a entrada.
	 *    O scanner não avança passado qualquer entrada.
	 */

	public static void main(String[] args) {
		
		 String s = "Hello World! \n 3 + 3.0 = 6 ";

		   // create a new scanner with the specified String Object
		   Scanner scanner = new Scanner(s);

		   // print the next line
		   System.out.println("" + scanner.nextLine());

		   // check if there is a next line again
		   System.out.println("" + scanner.hasNextLine());
		   

		   // print the next line
		   System.out.println("" + scanner.nextLine());

		   // check if there is a next line again
		   System.out.println("" + scanner.hasNextLine());

		   // close the scanner
		   scanner.close();
		   }

	}


