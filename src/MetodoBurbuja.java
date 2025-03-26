public class MetodoBurbuja {
    
    public void ordenarAcsendente(int[] arreglo){

        for (int i=0; i<arreglo.length;i++){

            for (int j=i+1; j<arreglo.length;j++){

                //System.out.println("i=" + i + " j=" + j);
                if (arreglo[i] > arreglo[j]){  //condicion de intercambio
                    // Intercambio
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    public void ordenar(int[] arreglo,boolean isDes){

        for (int i=0; i<arreglo.length;i++){

            for (int j=i+1; j<arreglo.length;j++){

                //System.out.println("i=" + i + " j=" + j);
                if (isDes){
                    if (arreglo[i] < arreglo[j]){  //condicion de intercambio
                        // Intercambio
                        
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
                else{
                    if (arreglo[i] > arreglo[j]){  //condicion de intercambio
                        // Intercambio
                        
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
                
            }
        }
    }

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