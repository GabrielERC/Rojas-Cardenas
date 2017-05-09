import java.util.*;
public class Puntos {
	public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    int A[]= new int[]{3,56,1,9,8,12,34,65};
    int auxiliar;
    
    System.out.println("\n**Burbuja**\n");
    
    for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j]>A[j + 1]) {
                    auxiliar = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = auxiliar;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"|");
        }
       
        System.out.println("\n**Insercion**\n");
       
        int j; 
        for (int i = 1; i < A.length; i++) {
            auxiliar = A[i];
            for (j = i - 1; j >= 0 && A[j] > auxiliar; j--) {
                A[j + 1] = A[j];
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"|");
        }     
        
        System.out.println("\n**Busqueda Lineal**\n");
        
        int y;
        System.out.println("El vector es: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"|");
        }
        System.out.println("\nDigite numero que desee encontrar:");
        y=leer.nextInt();
        int Indice=-1;
        for (int i = 0; i < A.length; i++) {
            if (A[i]==y) 
            {
                Indice=i;
                break;
            }
        }
        System.out.println("Numero "+ y + " en la posicion: " + Indice );
        
        System.out.println("\n**Busqueda Binaria**\n");
        
        int x;
        System.out.println("El vector es: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"|");
        }
        System.out.println("\nDigite numero que desee encontrar:");
        x=leer.nextInt();
        int inf=0, sup=A.length-1;
        int mitad;
        int indice=-1;
        while (inf < sup)
        {
           mitad = (sup + inf) / 2;
            if (A[mitad]==x) 
            {
              indice=mitad;
              break;
            }else
            {
                if (A[mitad]>x) 
                {
                    sup= mitad-1;
                }
                else
                {
                    inf=mitad+1;
                }
            }
        }
        if (inf==sup&&A[inf]==x) 
        {
            indice = inf;
        }
         System.out.println("Numero " + x + " esta en la posicion: " + indice );
         
         System.out.println("\n**Busqueda Interpolacion**\n");
         
        int z; 
        System.out.println("El vector es: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"|");
        }
        System.out.println("\nDigite numero que desee encontrar:");
        z=leer.nextInt();
        int Inf=0, Sup=A.length-1;
        int Mitad= Inf+((sup-Inf)/(A[sup]-A[Inf]))*(z-A[Inf]);
        int indicep=-1;
        
        while (Inf < Sup)
        {
            if (Mitad>Sup || Mitad>Inf) 
            {
                break;
            }
            else
            {
               Mitad = Inf+((Sup-Inf)/(A[Sup]-A[Inf]))*(z-A[Inf]);
           
            {
              if (z==A[Mitad]) 
            {
              indicep=Mitad;
              break;
            }
              else
            {
                if (A[Mitad]>z) 
                {
                    Sup= Mitad-1;
                }
                else
                {
                    Inf=Mitad+1;
                }
            }
        }
        if (Inf==Sup&&A[Inf]==z) 
        {
            indicep = Inf;
        }
            
        }
           
        }
        System.out.println("Numero "+ z + " en la posicion: " + indicep );     
    }
}
