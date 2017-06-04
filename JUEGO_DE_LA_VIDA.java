import java.util.*;
public class JUEGO_DE_LA_VIDA {
 public static void main(String[] args){
	 Scanner leer = new Scanner(System.in);
     Random ram = new Random();
     int n,contador=0,mitad;
     
     do 
     {
         System.out.print("Ingrese Tamaño de la matriz menor a 100 y a 5:");
         n=leer.nextInt();
         if (n>100||n<5) {
             System.out.println("Dato no valido");
         }
         
     } while (n>100||n<5);
     mitad =n/2;
     int M[][]=new int[n][n];
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
           M[i][j]=ram.nextInt(n);
             if (M[i][j]>mitad) 
             {
                 M[i][j]=1;
             }
             else
             {
                 M[i][j]=0;
             }
         }
     }
     System.out.println("Matriz:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             System.out.print(M[i][j]+"|");
         }
         System.out.println("");
     }       
     System.out.println("Juego de la vida");
     while (true) 
     {            
         for (int i = 0; i < n; i++) 
         {
             for (int j = 0; j < n; j++) 
             {
               contador=M[(i-1+n)%n][(j-1+n)%n]+M[(i-1+n)%n][j]+ 
                        M[(i-1+n)%n][((j+1)%n)]+M[i][(j-1+n)%n]+
                        M[i][(j+1)%n]+M[(i+1)%n][(j-1+n)%n]+
                        M[(i+1)%n][j]+M[(i+1)%n][(j+1)%n];
                 if (M[i][j]==1) 
                 {
                     if (contador>3||contador<2) 
                     {
                        M[i][j]=0; 
                     }
                 }
                 else
                 {
                     if (contador==3) 
                     {
                         M[i][j]=1;
                     }
                 }
                 System.out.print(M[i][j]+" ");
             }
             System.out.println("");
         }  
     }
 }
}
