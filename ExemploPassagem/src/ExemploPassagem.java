
public class ExemploPassagem {

	public static void main(String[] args) {

		
		System.out.print("Vamos começar :");
		
		System.out.println("Primeira linha");
		
		espaco();
		
		System.out.println("Segunda linha");
		
		espacotres();
		
		System.out.println("Terceira linha");

		System.out.print("Percentagem da hora que já correu :");
		int minuto;
		minuto=35;
		System.out.println(minuto*100/60);

	}

	private static void espacotres() {

        espaco();
        espaco();
        espaco();
		
	}

	private static void espaco() {
	
		System.out.println("");
		
	}

}
