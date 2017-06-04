import java.util.*;

import javax.swing.JApplet;
public class TRIQUI {
	
public static void main(String[] arg) {
	Scanner leer = new Scanner(System.in);
    char M[][] = new char[3][3];
    int jugadas = 0, columna, fila;
    boolean jugador1 = true;       
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            M[0][0]='A';                
            M[0][1]='B';
            M[0][2]='C';
            M[1][0]='D';
            M[1][1]='E';
            M[1][2]='F';
            M[2][0]='G';
            M[2][1]='H';
            M[2][2]='I';
        }
    }
    while (jugadas < 9) {
        if (jugador1) {
            jugador1 = false;
            System.out.println("\nJugador 1\n");
            do{
               do {
                System.out.print("Ingrese Fila:");
                fila = leer.nextInt();
                if (fila>= 3||fila<0) {
                    System.out.println("\nFila no valida\n");
                }
               }while (fila>= 3||fila<0);
               do{
                System.out.print("Ingrese Columna:");
                columna = leer.nextInt();
                if (columna>= 3||columna<0) {
                    System.out.println("\ncolumna no valida\n");
                }
               }while (columna>= 3||columna<0);

                if (M[fila][columna] == 'X'||M[fila][columna]=='O') {
                    System.out.println("\nEspacio ya usado\n");
                }
            }while (M[fila][columna] == 'X'||M[fila][columna]=='O');

            M[fila][columna] = 'X';
            System.out.println("\nTriqui\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(M[i][j]+"|");  
                }
                System.out.println();                   
            }
            if (M[fila][0] == M[fila][1] && M[fila][1] == M[fila][2]) {
                System.out.println("GANO JUGADOR 1");
                break;
            } else if (M[0][columna] == M[1][columna] && M[1][columna] == M[2][columna]) {
                System.out.println("GANO JUGADOR 1");
                break;
            } else if (M[0][0] == M[1][1] && M[1][1] == M[2][2]) {
                System.out.println("GANO JUGADOR 1");
                break;
            }else if (M[0][2] == M[1][1] && M[1][1] == M[2][0]) {
                System.out.println("GANO JUGADOR 1");
                break;
            }

        } else {
            jugador1 = true;
            System.out.println("\nJugador 2\n");
            do{
               do {
                System.out.print("Ingrese Fila:");
                fila = leer.nextInt();
                if (fila>= 3||fila<0) {
                    System.out.println("\nFila no valida\n");
                   }
               }while (fila>= 3||fila<0);
               do{
                System.out.print("Ingrese Columna:");
                columna = leer.nextInt();
                if (columna>= 3||columna<0) {
                    System.out.println("\ncolumna no valida\n");
                }
               }while (columna>= 3||columna<0);               
                if (M[fila][columna] == 'X'||M[fila][columna]=='O') {
                    System.out.println("\nEspacio ya usado\n");
                }
            }while (M[fila][columna] == 'X'||M[fila][columna]=='O');

            M[fila][columna] = 'O';
            System.out.println("\nTriqui\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(M[i][j]+"|");  
                }
                System.out.println();                      
            }
            if (M[fila][0] == M[fila][1] && M[fila][1] == M[fila][2]) {
                System.out.println("GANO JUGADOR 2");
                break;
            } else if (M[0][columna] == M[1][columna] && M[1][columna] == M[2][columna]) {
                System.out.println("GANO JUGADOR 2");
                break;
            } else if (M[0][0] == M[1][1] && M[1][1] == M[2][2]) {
                System.out.println("GANO JUGADOR 2");
                break;
            }else if (M[0][2] == M[1][1] && M[1][1] == M[2][0]) {
                System.out.println("GANO JUGADOR 2");
                break;
            }
        }
        
        jugadas++;
    }
}
}
