import java.util.Scanner;

public class TabuadaScanner {

	public static void main(String[] args) {

	      Scanner in = new Scanner(System.in);
	      System.out.println("numero pls");
	        int N = in.nextInt();
	        int i,r;
			for (i=1; i<11; i++){
				
				r = N * i;
				
				System.out.println(N + " x "+ i + " = "+ r );
	        	
	        	
	        }

	}

}
