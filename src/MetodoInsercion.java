public class MetodoInsercion {
    public int[] ordenarAcsendente(int[] arreglo, boolean valido){
        
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 1; i < tam ; i++){
            int aux = arreglo[i];
            int j = i-1;

            contComparaciones ++;

            if (valido){
                System.out.print("\nComparaciones= " + contComparaciones + 
                                " = " + arreglo[i] + " -> " + arreglo[j]);

                System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);
            }

            while (j >= 0 && aux < arreglo[j]) {
                
                contCambios ++;

                arreglo[j+1] = arreglo[j];  //Este se encarga de mover los valores

                j = j-1;
                
            }
            arreglo[j + 1] = aux;

            System.out.print(" \n");
            System.out.print("Estado actual => ");
            for(int c = 0; c < tam; c ++){ 

                System.out.print(arreglo[c] + " ");
                }
            System.out.print("\n");
        }
        int[] resultados = {contComparaciones, contCambios};
        return resultados;      
    }
//-----------------------------------------------------------------------------------------------------------------------
public int[] ordenarDesendente(int[] arreglo, boolean valido){
        
    int tam = arreglo.length;
    int contComparaciones = 0;
    int contCambios = 0;

    for (int i = 1; i < tam ; i++){
        int aux = arreglo[i];
        int j = i-1;

        contComparaciones ++;

        if (valido){
            System.out.print("\nComparaciones= " + contComparaciones + 
                            " = " + arreglo[i] + " -> " + arreglo[j]);
            
            System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);        }

        while (j >= 0 && aux > arreglo[j]) {
            
            contCambios ++;

            arreglo[j+1] = arreglo[j];  //Este se encarga de mover los valores

            j = j-1;
            
        }
        arreglo[j + 1] = aux;

        System.out.print(" \n");
        System.out.print("Estado actual => ");
        for(int c = 0; c < tam; c ++){ 

            System.out.print(arreglo[c] + " ");
            }
        System.out.print("\n");
    }
    int[] resultados = {contComparaciones, contCambios};
    return resultados;      
}
//-----------------------------------------------------------------------------------------------------------------------
    public void printArray(int[] arreglo){
        for (int i : arreglo) {
            System.out.print(i + " - ");
        }
    }
}
