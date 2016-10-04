import java.util.Scanner;

public class AnexoUm {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String myString = scanner.next();
		int myInt = scanner.nextInt();
		
		System.out.println("Coloca valor a : ");
		
		int a = scanner.nextInt();
		
		System.out.println("Coloca valor b : ");
		
		int b = scanner.nextInt();
		scanner.close();

		
		
		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);
		System.out.println(a);
		System.out.println(b);
	}

}
