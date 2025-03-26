//import java.lang.reflect.Array;

public class App {
    
    // [def main()] en java
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* 
        int x = 5;                                  //x = 5
        boolean condicion=false;                    //condicion = False
        String nombre="Jaime";                      //nombre = "Jaime"
        */

        int [] listado1 = {64,25,12,22,11};             //listado=[10,21,5,8,-1,0]
        int [] listado2 = {64,25,12,22,11};
        int [] listado3 = {64,25,12,22,11};

        MetodoBurbuja mB = new MetodoBurbuja();     //import MetodoBurbuja
        System.out.println("-----Metodo Burbuja-----");


        //mB.imprimirArreglo(listado);
        //System.out.println();
        //mB.ordenarAcsendente(listado);
        //mB.imprimirArreglo(listado);
        
        mB.imprimirArreglo(listado1);
        System.out.println("-----Ordenado ascendemente-----");
        mB.ordenar(listado1, false);
        mB.imprimirArreglo(listado1);
        
//---------------------------------------------------------------------------------------------------------------------
        //int[] array = {64,25,12,22,11};

        //int[] listado = new int[1000];

        //for(int i=0; i < listado.length; i++){
            //listado[i] =(int) (Math.random() *10000) + 1;
        //}
        System.out.print("\n-----Metodo seleccion-----\n");
        MetodoSeleccion mS = new MetodoSeleccion(); 

        mS.printArray(listado2);

        System.out.println("\n-----Ordenado Desendentemente-----");
        mS.ordenar(listado2, false);

        mS.printArray(listado2);
        //System.out.println("\nAccendente");
        //mS.ordenar(listado, true);
        //mS.printArray(listado);

        //System.out.println("\nSe acabo");

//---------------------------------------------------------------------------------------------------------------------
        
        //int [] listado = {64,25,12,22,11};

        MetodoInsercion mI = new MetodoInsercion();

        System.out.print("\n\n-----Metodo incersion----- \n");
        mI.printArray(listado3);
        mI.ordenarAcsendente(listado3, true);

        System.out.print("\n-----Ordenado Acsendentemente-----\n");
        mI.printArray(listado3);
        System.out.print("\nSe acabo");
    }
}
