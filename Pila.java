import java.util.*;
public class Pila {
    
	public static void main (String[] arg) {
		Scanner leer = new Scanner(System.in);
		Stack< String> pila=new Stack< String>();
		System.out.println("Este programa pide numero los almacena en una pila y los imprime\n ");
		for(int i=0; i<7; i++) {
			System.out.print("Digite cualquier numero: ");
			int n=leer.nextInt();
			pila.push(Integer.toString(n));			
		}
                System.out.println("Pila:");
                for (int i = 0; i < 7; i++) {
                    while (!pila.empty())
		    System.out.println(pila.pop());                
            }
	}
}
