import java.text.DecimalFormat;

public class FichMeta {

	public static void main(String[] args) {
		
		String titulo = "INDU";
		String real = titulo + "," + "2016-10-04,18267.679688,18313.769531,18116.259766,18168.449219,797112121212121212,18168.449219";
	    String subreal =real.replaceAll("-", "");
	    System.out.println(subreal);
	    int posVirg = real.indexOf(',');
	    posVirg = real.indexOf(',',posVirg+1);
	    posVirg = real.indexOf(',',posVirg+2);
	    posVirg = real.indexOf(',',posVirg+3);
	    posVirg = real.indexOf(',',posVirg+4);
	    posVirg = real.indexOf(',',posVirg+5);
	    posVirg = real.indexOf(',',posVirg+6);
		System.out.println(posVirg); //86 
	    String completa = subreal.substring(0, 84);
	    //é menos 2, 1 da virgula okapa e o outro posição + 1
		System.out.println(completa);
		
		String identifica ="(\\w{1,5}),(\\d{4})-(\\d{2})-(\\d{2}),(\\d{1,5}).(\\d{2})";
		boolean r1 = real.matches(identifica);
		System.out.println(r1);  
		String residentifica = real.replaceAll(identifica, "$1,$2$3$4,$5.$6");
		System.out.println(residentifica);
		
		String pattern = "#####.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);

		String format = decimalFormat.format(123456789.123);
		System.out.println(format);
		
		
		String [] tokens = real.split(",");
        System.out.println(tokens.length + " tokens"); 
        
        String dat = tokens [1].toString();
        
        System.out.println(dat.replace("-", ""));
        
        String dat3 = tokens [3];      
        
        
        
        int p = tokens [3].indexOf(".");
        
        
        
        if (p > 2 ){
        	
        	System.out.println(tokens [1].replaceAll("-",""));
        	
        	
        	
        	String e = dat3.substring(0, (p+3));
        	
        	System.out.println(e);
        	
        	
        	//int fg = decimalFormat.format(diz);
        	
         System.out.println();
        	
        
        	
          System.out.println("boa");
        
        }else{
        	
        	System.out.println("má");
        	
        }
        
        System.out.println(p);
        
        System.out.println(dat3);
        
        displayElement(tokens); 
        
       /*
		
		for (String separa : tokens){
			
			
			
			System.out.println(separa);

	}
*/
	}

	private static void displayElement(String[] tokens) {
		
		for(int i=0;i < tokens.length; i++) 
			System.out.println(tokens[i]+",");
		
	}


	}
	
