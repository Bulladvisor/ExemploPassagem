import java.util.Arrays;

public class Ordena��oArray {

	public static void main(String[] args) {
		
		int[] numero = {190,90,87,1,50,23,11,5,55,2}; 
		//Antes da ordena��o displayElement(numero); 
		//Depois da ordena��o 
		Arrays.sort(numero); 
		displayElement(numero); 
		} 
		public static void displayElement(int[] array){ 
		for(int i=0;i < array.length; i++) 
		System.out.print(array[i]+",");
		 } 


	}


