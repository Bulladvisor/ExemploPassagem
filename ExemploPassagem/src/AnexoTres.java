import java.util.Scanner;

public class AnexoTres {

	public static void main(String[] args) {

   /*
    * inputs por exemplo 4  - 3,14 e tr�s nomes jorge silva matos
    */
		
		        Scanner scan = new Scanner(System.in);
		        
		        int i = scan.nextInt();
		        
		        //Colocar o valor com virgula, sen�o d� erro no double
		        
		        double d = scan.nextDouble();
		        
		  
				scan.nextLine();
		        
                String s = scan.nextLine();
                
		        
		
		        /*
		         * O problema deste exercicio, � que o texto
		         * n�o aparecia todo, porque tinha de limpar o buffer
		         * para isso acontecer, teve-se de criar a linha
		         * scan.nextLine();
		         */
		        
                

		      
		        System.out.println("String: " + s);
		        System.out.println("Double: " + d);
		        System.out.println("Int: " + i);
	}

}
