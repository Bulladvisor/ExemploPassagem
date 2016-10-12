
public class FichMetaDois {

	public static void main(String[] args) {
		
		String titulo = "INDU";
		String real = titulo + "," + "2016-10-04,1.679688,1.769531,1.259766,1.449219,1234567890,18168.449219";
		
		
		 int posVirg = real.indexOf(',');
		    posVirg = real.indexOf(',',posVirg+1);
		    posVirg = real.indexOf(',',posVirg+2);
		    posVirg = real.indexOf(',',posVirg+3);
		    posVirg = real.indexOf(',',posVirg+4);
		    posVirg = real.indexOf(',',posVirg+5);
		    posVirg = real.indexOf(',',posVirg+6);
			System.out.println(posVirg); //86 
		    String completa = real.substring(0, posVirg);
		    //é menos 2, 1 da virgula okapa e o outro posição + 1
			System.out.println(completa);
		
		real = completa;
		
		String [] escalar = real.split(",");
		
		int tamanho = escalar.length;
		System.out.println("tamanho do array " + tamanho);
		
		String dat = escalar [1].toString();
		
		dat = dat.replace("-", "");
		
		escalar [1] = dat;
		
	    int quanto = escalar [2].indexOf(".");
	    
	    boolean condzero = escalar [2].matches("0.*");
		
         System.out.println("quanto " + quanto);
         
         if(quanto>=4){
        	 
        	 escalar [2] = escalar[2].substring(0, (quanto+3));
        	 
        	 escalar [3] = escalar[3].substring(0, (quanto+3));
        	 
        	 escalar [4] = escalar[4].substring(0, (quanto+3));
        	 
        	 escalar [5] = escalar[5].substring(0, (quanto+3));
        	 
        	 
        	 
         }else{ if(quanto>=2 && quanto <4){
        	 
         
             escalar [2] = escalar[2].substring(0, (quanto+4));
        	 
        	 escalar [3] = escalar[3].substring(0, (quanto+4));
        	 
        	 escalar [4] = escalar[4].substring(0, (quanto+4));
        	 
        	 escalar [5] = escalar[5].substring(0, (quanto+4));
        	  
     
        	 
         }else{ if(quanto>=0 && condzero){
        	 
             
             escalar [2] = escalar[2].substring(0, (quanto+5));
        	 
        	 escalar [3] = escalar[3].substring(0, (quanto+5));
        	 
        	 escalar [4] = escalar[4].substring(0, (quanto+5));
        	 
        	 escalar [5] = escalar[5].substring(0, (quanto+5));
        	  
        	 
         }else
        	 
         escalar [2] = escalar[2].substring(0, (quanto+4));
    	 
    	 escalar [3] = escalar[3].substring(0, (quanto+4));
    	 
    	 escalar [4] = escalar[4].substring(0, (quanto+4));
    	 
    	 escalar [5] = escalar[5].substring(0, (quanto+4));
    	  
        	 
         }
         }
		
		displayValores(escalar); 
		
		
	}

	private static void displayValores(String[] escalar) {
	
		for(int i=0;i < escalar.length; i++) 
			System.out.print(escalar[i]+",");
		


	}

}
