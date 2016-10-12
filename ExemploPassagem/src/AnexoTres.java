import java.util.Scanner;

public class AnexoTres {

	public static void main(String[] args) {

   /*
    * inputs por exemplo 4  - 3,14 e três nomes jorge silva matos
    */
		
		        Scanner scan = new Scanner(System.in);
		        
		        int i = scan.nextInt();
		        
		        //Colocar o valor com virgula, senão dá erro no double
		        
		        double d = scan.nextDouble();
		        
		  
				scan.nextLine();
		        
                String s = scan.nextLine();
                
		        
		
		        /*
		         * O problema deste exercicio, é que o texto
		         * não aparecia todo, porque tinha de limpar o buffer
		         * para isso acontecer, teve-se de criar a linha
		         * scan.nextLine();
		         */
		        
                

		      
		        System.out.println("String: " + s);
		        System.out.println("Double: " + d);
		        System.out.println("Int: " + i);
	}

}
