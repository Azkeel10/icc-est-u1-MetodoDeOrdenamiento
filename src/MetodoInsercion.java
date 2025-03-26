public class MetodoInsercion {
    public void ordenarAcsendente(int[] arreglo, boolean pasos){

        int tam = arreglo.length;

        for (int i = 1; i < tam ; i++){
            int aux = arreglo[i];

            int j = i-1;

            if (pasos){
            System.out.println("\n i: " + i + ", j: " + j + ", aux: " + aux);
            for (int c : arreglo) {
                System.out.print(c + "-");
            }
            }

            while (j >= 0 && aux < arreglo[j]) {
                
                arreglo[j+1] = arreglo[j];  //Este se encarga de mover los valores

                j = j-1;
                if (pasos){
                    System.out.print("\n pos: " + i + ", pas: " + j );
                    
                    }
            }
            arreglo[j + 1] = aux;
        }      
    }
//-----------------------------------------------------------------------------------------------------------------------


//-----------------------------------------------------------------------------------------------------------------------
    public void printArray(int[] arreglo){
        for (int i : arreglo) {
            System.out.print(i + " - ");
        }
    }
}
