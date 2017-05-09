
import java.util.*;
public class Puntos {
	
	public static void main (String[] args ){
		int n;
		Scanner leer = new Scanner(System.in);
		  Random ram = new Random();
	     System.out.print("Ingrese tamaño del vector:");
	     n = leer.nextInt();
	     int A[] = new int[n];

	     System.out.println("\n**1 PUNTO**\n");

	     int d=0;
	     int minimo;
	     System.out.println("El vector es:");
	     for (int i = 0; i < n; i++) {
	         A[i] = ram.nextInt(n);
	         System.out.print(A[i] + "|");
	     }
	     for (int p = 0; p < n; p++) {
	         for (int q = 0; q < n; q++) {
	             minimo = A[p] - A[q];
	             if (q != p) {
	                 d=minimo;
	             }
	         }
	     }
	     System.out.println("\nLa distancia minima es: " + d);

	     System.out.println("\n**2 PUNTO**\n");

	     int A1[] = {1, 1, 2, 2, 3, 3, 4};
	     int c = 0;
	     for (int i = 0; i < A1.length; i++) {
	         for (int j = 0; j < A.length; j++) {
	             if (A1[i] != A1[i]) {
	                 c =i;  
	                 break;
	             }
	         }
	     }
	     System.out.print("Numero que no aparece dos veces en la posicion: " + c);
	    
	     System.out.println("\n**3 PUNTO**\n");
	     
	     System.out.println("Digite numero: ");
	     d=leer.nextInt();
	     int con=0;
	     for (int i = 0; i < n; i++) {
	         for (int j = 0; j < n; j++) {
	             if (A[i]-A[j]==d) 
	             {
	                 con++;
	             }
	             else
	              {
	               j++;
	              }
	         }            
	     }
	     System.out.println("\nNumero de parejas: "+ con);
	  
	     System.out.println("\n**4 PUNTO**\n");
	     
	     int dis;
	     int maximo=0;
	     System.out.println("El vector es:");
	     for (int i = 0; i < n; i++) {
	         A[i] = ram.nextInt(n);
	         System.out.print(A[i] + "|");
	     }
	     for (int p = 0; p < n; p++) {
	         for (int q = p+1; q < n; q++) {
	             dis = A[p] - A[q];
	             if (dis > maximo) {
	                 maximo=dis;
	             }
	         }
	     }
	     System.out.println("\nDistnacia mas grande es: "+ maximo);
	     
	    System.out.println("\n**5 PUNTO**\n");
	     
	    int mul=1;
	    int A2[]=new int[]{10,4,1,6,2};
	     int B[] = new int[A2.length];
	      for (int i = 0; i < A2.length; i++) {
	        for (int j = 0; j < A2.length; j++) {
	             if (i!=j) {
	            	 if(i>A2.length){
		                 mul=mul*A[i];	 
	            	 }                
	            }               
	         } 
	        B[i]=mul; 
	    }
	     for (int i = 0; i < A2.length; i++) {
	        System.out.print(B[i]+"|");
	    }
	     
	     System.out.println("\n**6 PUNTO**\n");
	     
	     int A3[] = new int []{1,1,0,1,0,0,1,1};
	     int t =(A3.length/2);
	     t=t*2;
	     
	     
	     
	     for (int i = t; i >= 2; i-=2) 
	     {   int cu=0,cc=0;
	         for (int j = 0; j <t-i; j++) 
	         {
	        	 for (int j2 = j; j2 < j++; j2++) {
	        		 if (A3[i]==1) {
		                 cu++;
		             }
		             if (A3[i]==0) {
		                 cc++;
		             }
				  }           
	               if (cu==cc) {
	  	           System.out.print(i+"|");
	  	           i=-1;
	  	           break;
				}
	         }
	     }
	}
           
 }
