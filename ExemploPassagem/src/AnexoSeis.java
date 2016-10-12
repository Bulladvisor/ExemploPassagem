import java.util.Scanner;

public class AnexoSeis {

	public static void main(String[] args) {
	
		int res=0;
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
           
         /*
            for(int j=0;j<n;j++){
                x1 = x1+(int)(Math.pow(2,j))*b;
                System.out.print(x1+" ");
            }
                x1=0;
                System.out.println();
               	
              	 */
            for(int j=0;j<n;j++){
                res = res + (int)(Math.pow(2,j))*b;
                System.out.print(res+" ");
            }
            System.out.print("t" + t);
            System.out.print("a" + a);
            System.out.print("b" + b);
            System.out.print("n" + n);
        }
        in.close();
        
     
        	
        }

}


