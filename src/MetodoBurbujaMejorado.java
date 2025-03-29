public class MetodoBurbujaMejorado {
    public int[] ordenarAcsendente(int[] arreglo,boolean valido){    //(void por int) puedo usar el return y me devuelve un numero
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;


        for (int i = 0; i < tam - 1; i++){

            for (int j = 0; j < tam - 1 - i; j++){      //( j < tam - 1 - i) para q ahora si sea la burbuja mejorada
                
                contComparaciones ++;

                if (valido){
                    System.out.print("\nComparaciones: " + contComparaciones + 
                                " -> " + arreglo[i] + " -> " + arreglo[j]);
                    
                    System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);
                }
    
                if (arreglo[j] > arreglo[j + 1]){  
                        
                    contCambios ++;
    
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
            System.out.print(" \n");
            System.out.print("Estado actual => ");
            for(int c = 0; c < tam; c ++){ 

                System.out.print(arreglo[c] + " ");
                }
            System.out.print("\n");
        }
        int [] resultados = {contComparaciones,contCambios};
        return resultados;
    }
//-----------------------------------------------------------------------------------------------------------------------
public int[] ordenarDesendente(int[] arreglo,boolean valido){   
    int tam = arreglo.length;
    int contComparaciones = 0;
    int contCambios = 0;

    for (int i = 0; i < tam - 1; i++){

        for (int j = 0; j < tam - 1 - i; j++){ 
            
            contComparaciones ++;

            if (valido){
                System.out.print("\nComparaciones: " + contComparaciones + 
                            " -> " + arreglo[i] + " -> " + arreglo[j]);

                System.out.print("\nIntercambio: " + arreglo[i] + " <-> " + arreglo[j]);
            }

            if (arreglo[j] < arreglo[j + 1]){  
                
                contCambios ++;

                int aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
            }
        }
        System.out.print(" \n");
        System.out.print("Estado actual => ");
        for(int c = 0; c < tam; c ++){ 

            System.out.print(arreglo[c] + " ");
            }
        System.out.print("\n");
    }
    int [] resultados = {contComparaciones,contCambios};
    return resultados;
}


//-----------------------------------------------------------------------------------------------------------------------
    public void printArray(int[] arreglo){
        for(int i = 0; i < arreglo.length; i ++){ 

            System.out.print( arreglo[i] + " , ");
            }
    }
}
