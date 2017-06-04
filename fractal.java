
package Fractal;
import java.util.*;
public class fractal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random ram = new Random();
        int n;
        do {
            System.out.print("Ingrese tamaño de Matriz:");
            n=leer.nextInt();
            if (n>100 || n<5) {
                System.out.println("Dato no valido");
            }
            
        } while (n>100 || n<5);
        int mitad=n/2;
        int M[][]=new int[n][n];
        int []rule={1,1,0,0,1,1,1,0};
        System.out.println("Primera parte:");
        for (int j = 0; j < n; j++) {
            M[0][j]=ram.nextInt(n);
                if (M[0][j]>mitad) 
                {
                    M[0][j]=1;
                }
                else
                {
                    M[0][j]=0;
                }
            System.out.print(M[0][j]+"|");
        }
        System.out.println("\nFractal\n");
        for (int i = 1; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (j==0) 
                {
                    M[i][j]=rule[(M[i-1][j]*2)+(M[i-1][j+1]*1)];
                }
                else
                {
                    if (j==n-1) 
                    {
                        M[i][j]=rule[(M[i-1][j-1]*4)+(M[i-1][j]*2)];
                    }
                    else
                    {
                        M[i][j]=rule[(M[i-1][j-1]*4)+(M[i-1][j]*2)+(M[i-1][j+1])*1];
                    }
                }
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    }
 
}
