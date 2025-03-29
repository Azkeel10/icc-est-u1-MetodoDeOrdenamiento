public class MetodoSeleccion {

    public int[] ordenarAcsendente(int[] arreglo, boolean valido){
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        
        for (int i = 0; i < tam - 1; i++) {
            int iM = i;

            for (int j = i + 1; j < tam; j++) {
                contComparaciones ++;

                if (valido){
                    System.out.print("\nComparaciones= " + contComparaciones + 
                                    " = " + arreglo[i] + " -> " + arreglo[j]);

                    System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);
                }

                if (arreglo[j] < arreglo[iM]) { 
                    iM = j;
                }
            }
            if (i != iM) {

                contCambios ++;

                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
            System.out.print(" \n");
            System.out.print("Estado actual => ");
            for(int c = 0; c < tam; c ++){ 

                System.out.print(arreglo[c] + " ");
                }
            System.out.print("\n");
        }
        int [] resultado = {contComparaciones,contCambios};
        return resultado;
    }
//-----------------------------------------------------------------------------------------------------------------------
    public int[] ordenarDesendente(int[] arreglo, boolean valido){
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < tam - 1; i++) {
            int iM = i;
    
            for (int j = i + 1; j < tam; j++) {

                contComparaciones ++;

                if (valido){
                    System.out.print("\nComparaciones= " + contComparaciones + 
                                    " = " + arreglo[i] + " -> " + arreglo[j]);
                                
                    System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);
                }

                if (arreglo[j] > arreglo[iM]) {
                    iM = j;
                }
            }
            if (i != iM) {

                contCambios ++;

                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
            System.out.print(" \n");
            System.out.print("Estado actual => ");
            for(int c = 0; c < tam; c ++){ 

                System.out.print(arreglo[c] + " ");
                }
            System.out.print("\n");
        }
        int [] resultado = {contComparaciones,contCambios};
        return resultado;
    }
//-----------------------------------------------------------------------------------------------------------------------
    public void printArray(int[] arreglo){

        for(int i = 0; i < arreglo.length; i ++){ 
            System.out.print( arreglo[i] + " - ");
        }
    }
}
