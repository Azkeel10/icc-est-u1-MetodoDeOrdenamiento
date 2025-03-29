public class MetodoBurbuja {
    
    public int [] ordenarAcsendente(int[] arreglo,boolean valido){
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i=0; i < tam;i++){

            for (int j = i + 1; j < tam; j++){

                contComparaciones ++;

                if (valido){
                    System.out.print("\nComparaciones= " + contComparaciones + 
                                    " = " + arreglo[i] + " -> " + arreglo[j]);

                    System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);
                }

                if (arreglo[i] > arreglo[j]){  

                    contCambios++;

                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
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
//---------------------------------------------------------------------------------------------------------------------
    public int [] ordenarDesendente(int[] arreglo,boolean valido){
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i=0; i < tam;i++){

            for (int j = i + 1; j < tam; j++){
                contComparaciones ++;

                if (valido){
                    System.out.print("\nComparaciones= " + contComparaciones + 
                                    " = " + arreglo[i] + " -> " + arreglo[j]);

                    System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);
                }

                if (arreglo[i] < arreglo[j]) {
                    contCambios++;

                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
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
//---------------------------------------------------------------------------------------------------------------------
    //def imprimir_arreglo(arreglo)
    public void imprimirArreglo(int[] arreglo){

        // Python
        // for i in range(lens(arreglo)):
        // print(arreglo[i]

        for(int i = 0; i < arreglo.length; i ++){   //para impares(int i = 1; i < arreglo.length; i +=2)
                                                    //para pares(int i = 0; i < arreglo.length; i +=2)
            System.out.print( arreglo[i] + " - ");
        }
        System.out.println();
    }
}
