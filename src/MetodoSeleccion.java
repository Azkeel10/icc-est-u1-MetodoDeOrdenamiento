public class MetodoSeleccion {
//-----------------------------------------------------------------------------------------------------------------------
    public void ordenarAcsendente(int[] arreglo){
        for (int i = 0; i < arreglo.length - 1; i++) {
            int iM = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                
                if (arreglo[j] < arreglo[iM]) { 
                    iM = j;
                }
            }
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }
//-----------------------------------------------------------------------------------------------------------------------
    public void ordenarDesendente(int[] arreglo){
        for (int i = 0; i < arreglo.length - 1; i++) {
            int iM = i;
    
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[iM]) {
                    iM = j;
                }
            }
            if (i != iM) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[iM];
                arreglo[iM] = aux;
            }
        }
    }
//-----------------------------------------------------------------------------------------------------------------------
    public void ordenar(int[] arreglo, boolean isDes){
        if (isDes){

            for (int i = 0; i < arreglo.length - 1; i++) {
                int iM = i;
    
                for (int j = i + 1; j < arreglo.length; j++) {
                    
                    if (arreglo[j] < arreglo[iM]) {     //Se le usa < para hacer de manera desendente
                        iM = j;
                    }
                }
                if (i != iM) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[iM];
                    arreglo[iM] = aux;
                }
            }

        }else{
            
            for (int i = 0; i < arreglo.length - 1; i++) {
                int iM = i; 
        
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[j] > arreglo[iM]) {     //Se le cambia > para invertir el orden
                        iM = j;
                    }
                }
                if (i != iM) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[iM];
                    arreglo[iM] = aux;
                }
            }
        }
    }
//-----------------------------------------------------------------------------------------------------------------------
    public void printArray(int[] arreglo){

        for(int i = 0; i < arreglo.length; i ++){ 
            System.out.print( arreglo[i] + " - ");
        }
    }
}
