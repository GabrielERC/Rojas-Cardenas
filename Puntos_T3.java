import java.util.*;
public class Puntos {
	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n**PUNTO 1**\n");
        int n;
        do {
            System.out.print("Ingrese tamaño del vector menor a 8 y mayor de 4: ");
            n = leer.nextInt();
            if (n < 4 || n % 2 != 0 || n > 8) {
                System.out.println("Dato no valido");
            }
        } while (n < 4 || n % 2 != 0 || n > 8);
        
        Random ram = new Random();
        int A[][] = new int[n][n];
        int mit=n/2;
        System.out.println("Matriz");
        for(int i=0;i<n;i++){
        	for (int j = 0; j < A.length; j++) {
        		A[i][j] = ram.nextInt(50);
        		System.out.print(A[i][j] + "|");
			}
        	 System.out.println(" ");
        }

        System.out.println("\nRombo\n");
        for (int i = 0; i < A.length; i++) {
        	
            for (int j = 0; j < A.length; j++) {
                if (j<mit-1||j<i-mit||j>mit+i) {
                    System.out.print(A[i][j] + "|");
                }
                else{
                	A[i][j]=0;
                    System.out.print(A[i][j] + "|");
                }
            }
            System.out.println(" ");
        }
        
        System.out.println("\n**PUNTO 2**\n");
        
         int a = 0;
        int columna1 = 0;
        int compara = 0, compara1 = 0,compara2 = 1;
        do
        {
            System.out.print("\nIngrese tamaño del vector menor a 8 y mayor de 4: ");
            a = leer.nextInt();
            if (n < 4 || n % 2 != 0 || n > 8);
            {
                System.out.println("Dato no válido");
            }
           
        } while (n < 4 || n % 2 != 0 || n > 8);
        int con=1;
        System.out.println("Matriz");
         int A2[][] = new int [a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                  A2[i][j]=con;
                  System.out.print("["+A2[i][j]+"]");
                  con++;
                }
                System.out.println(""); 
            }
        int fila = a, columna = a;
        int [][] mat = new int [a][a];
        
        columna1 = fila * columna;
        compara1 = fila - 1;
        System.out.println("Matriz caracol:");
        while (compara2 <= columna1) 
        {
            for (int f = compara; f <= compara1; f++) 
            {
                mat[compara][f] = compara2;
                compara2 = compara2 + 1;
            }
            for (int f = compara + 1; f <= compara1; f++) 
            {
                mat[f][compara1] = compara2;
                compara2 = compara2 + 1;
            }
            for (int f = compara1 - 1;f >= compara; f--) 
            {
                mat[compara1][f] = compara2;
                compara2 = compara2 + 1;
            }
            for (int f = compara1 - 1 ; f >= compara + 1; f--) 
            {
                mat[f][compara] = compara2;
                compara2 = compara2+1;
            }
            compara = compara + 1;
            compara1 = compara1 - 1;
        }
        for (int f = 0; f < fila; f++) 
        {
            for (int c = 0; c < columna; c++) 
            {
                System.out.print("[" + mat[f][c] + "]");
            }
            System.out.println();
        }
        
               System.out.println("\n**PUNTO 3**\n"); 
        
        int b,par=0,imp=0,pos=0,neg=0;
        do {
            System.out.print("Ingrese tamaño del vector menor a 8 y mayor de 4: ");
            b = leer.nextInt();
            if (b < 4 || b % 2 != 0 || b > 8) {
                System.out.println("Dato no valido");
            }
        } while (b < 4 || b % 2 != 0 || b > 8);
        int A1[][] = new int[b][b];        
        System.out.println("Matriz");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                A1[i][j] = ram.nextInt(b+1);
                System.out.print("["+A1[i][j] +"]");
            }
            System.out.println(" ");
        }               
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (A1[i][j]%2==0) {
                    par++;
                }
                if (A1[i][j]%2!=0) {
                   imp++; 
                }
                if (A1[i][j]>0) {
                    pos++;
                }
                if (A1[i][j]<0) {
                    neg++;
                }
            }
        }
        int pares[] = new int[par];
        int impares[]= new int[imp];
        int positivos[]= new int[pos];
        int negativos[]= new int[neg];
        System.out.println("Cantidad de pares: "+ par);
        System.out.println("Cantidad de impares: "+ imp);
        System.out.println("Cantidad de positivos: "+ pos);
        System.out.println("Cantidad de negativos: "+ neg);
        System.out.println("Pares:\n");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (A1[i][j]%2==0) {                   
                    pares[i]=A1[i][j];
                    System.out.print("["+pares[i]+"]");
                }                     
            }
        }
        System.out.println("\nImpares:\n");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (A1[i][j]%2!=0) {                   
                    impares[i]=A1[i][j];
                    System.out.print("["+impares[i]+"]");
                }                     
            }
        }
        System.out.println("\nPositivos:\n");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (A1[i][j]>0) {
                    positivos[i]=A1[i][j];
                    System.out.print("["+positivos[i]+"]");
                }                      
            }
        }
        System.out.println("\nNegativos:\n");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
               if (A1[i][j]<0) {
                    negativos[i]=A1[i][j];
                    System.out.print("["+negativos[i]+"]");
                }                     
            }
        }
        
        System.out.println("\n**PUNTO 4**\n"); 
        
          int c;
          do {
            System.out.print("Ingrese tamaño del vector menor a 8 y mayor de 4: ");
            c = leer.nextInt();
            if (c < 4 || c % 2 != 0 || c > 8) {
                System.out.println("Dato no valido");
            }
          } while (c < 4 || c % 2 != 0 || c > 8);       
           int A3[][]= new int [c][c];
           int AT[][]= new int [c][c];
           System.out.println("Matriz:");
           for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                A3[i][j] = ram.nextInt(c);
                System.out.print("["+A3[i][j]+"]");
                AT[j][i] = A3[i][j]; 

            }
            System.out.println(" ");
        }
           System.out.println("Matriz Transpuesta:");
           for (int i = 0; i < c; i++) {
               for (int j = 0; j < c; j++) {               
                   System.out.print("["+AT[i][j]+"]");
               }
               System.out.println("");
        }

    }

}
