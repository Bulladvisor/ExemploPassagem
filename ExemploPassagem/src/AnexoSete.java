
public class AnexoSete {

	public static void main(String[] args) {
	  
		int i,j,k,m;
		
		//k (posiçao)
		//i (passagens)
		
		
		
		for(i=0; i<=3; i++){
			
			j=0;
			
			for(k = 0; k<=4; k++){
							
				
                  if (i+j == 5){
					
                	  m = 0;
                	  
				}else
					if (i+j > 5){
						
						m = ((i+j)-5);
					}else {
					
					m= ((i+j)%6);
				}
				
						
				System.out.print(m);
			 
				
				j++;
				
			}
			
			
			System.out.printf("\n");
		}

	}

}	
