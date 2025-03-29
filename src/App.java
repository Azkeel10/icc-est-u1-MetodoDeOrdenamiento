//import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    
    // [def main()] en java
    public static void main(String[] args) throws Exception {
        System.out.println("\n----------Programa iniciado----------\n");

//---------------------------------------------------------------------------------------------------------------------    
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
//---------------------------------------------------------------------------------------------------------------------
        while (continuar) { 
            
            int [] listado = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
            int [] resultado;
            boolean valido = true;

            System.out.println("\n-----Metodos de ordenadmiento-----\n");

            System.out.println("1 -> Burbuja");
            System.out.println("2 -> Seleccion");
            System.out.println("3 -> Insercion");
            System.out.println("4 -> Burbuja Mejorado");
            System.out.println("5 -> Salir");

            int metodo = getPositive(scanner,"Ingresa la opcion: ");  //Otro modo de leer la opcion
//---------------------------------------------------------------------------------------------------------------------
            if (metodo == 5){
                System.out.print("\nAdios");
                continuar = false;
                break;
            }

            System.out.println("\nDesea ver los pasos?? (true/false)");
            boolean conPasos = scanner.nextBoolean();

            if (conPasos == true){
                valido = true;
            }else if( conPasos == false){
                valido = false;
            }else{
                System.out.println("\n-----Opcion invalida (true/false)-----");
            }

            String orden = getValisString(scanner, new String [] {"A", "D"}
            ,"Desea ordenar ascendentemente (A) o desendentemente (D)?: ");

            boolean ascendemente = orden.equalsIgnoreCase("A");
            //pregunta de prueba: el equals devuelve lo que pidas en este caso boolean
            
//---------------------------------------------------------------------------------------------------------------------
            switch (metodo) {
                case 1:
                    System.out.println("\n-----Metodo burbuja-----\n");

                    MetodoBurbuja mB = new MetodoBurbuja();
                    System.out.println("\n-----Arreglo----- \n");
                    mB.imprimirArreglo(listado); 
                    System.out.println("");

                    if (ascendemente) {
                        
                        resultado = mB.ordenarAcsendente(listado, valido); 
            
                        System.out.println("\n-----Ordenado ascendemente-----\n");
                        mB.imprimirArreglo(listado);  
                        
                        System.out.println("\nComparaciones= " + resultado[0]);
                        System.out.println("Cambios= " + resultado[1]);
                    } else {
                        resultado = mB.ordenarDesendente(listado,valido);
            
                        System.out.println("\n-----Ordenado descendentemente-----\n");
                        mB.imprimirArreglo(listado); 
            
                        System.out.println("\nComparaciones= " + resultado[0]);
                        System.out.println("Cambios= " + resultado[1]);
                    }
                break;
                

                case 2:
                    System.out.println("\n-----Metodo seleccion-----\n");

                    MetodoSeleccion mS = new MetodoSeleccion();
                    System.out.println("\n-----Arreglo----- \n");
                    mS.printArray(listado);
                    System.out.println("");

                    if(ascendemente){
                        resultado = mS.ordenarAcsendente(listado, valido); 

                        System.out.println("\n-----Ordenado ascendemente-----\n");
                        mS.printArray(listado);  
                        
                        System.out.println("\nComparaciones= " + resultado[0]);
                        System.out.println("Cambios= " + resultado[1]);
                    } else{
                        resultado = mS.ordenarDesendente(listado, valido); 

                        System.out.println("\n-----Ordenado descendentemente-----\n");
                        mS.printArray(listado);  
                        
                        System.out.println("\nComparaciones= " + resultado[0]);
                        System.out.println("Cambios= " + resultado[1]);
                    }
                    break;

                case 3:
                    System.out.println("\n-----Metodo insercion-----\n");

                    MetodoInsercion mI = new MetodoInsercion();
                    System.out.println("\n-----Arreglo----- \n");
                    mI.printArray(listado);
                    System.out.println("");

                    if(ascendemente){
                        resultado = mI.ordenarAcsendente(listado, valido); 

                        System.out.println("\n-----Ordenado ascendemente-----\n");
                        mI.printArray(listado);  
                        
                        System.out.println("\nComparaciones= " + resultado[0]);
                        System.out.println("Cambios= " + resultado[1]);
                    } else {
                        resultado = mI.ordenarDesendente(listado, valido); 

                        System.out.println("\n-----Ordenado Desendentemente-----\n");
                        mI.printArray(listado);  
                        
                        System.out.println("\nComparaciones= " + resultado[0]);
                        System.out.println("Cambios= " + resultado[1]);
                    }
                    break;

                case 4:
                    System.out.println("\n-----Metodo burbuja mejorada-----\n");
                    
                    MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();
                    System.out.println("\n-----Arreglo----- \n");
                    mBM.printArray(listado); 
                    System.out.println("");

                    if (ascendemente){

                        resultado = mBM.ordenarAcsendente(listado, valido);

                        System.out.println("\n-----Ordenado ascendemente-----\n");

                        mBM.printArray(listado);

                        System.out.println("\nComparaciones -> " + resultado[0]);
                        System.out.println("Cambios -> " + resultado[1]);
                        break;
                    }else{

                        resultado = mBM.ordenarDesendente(listado,valido);

                        System.out.println("\n-----Ordenado Desendentemente-----\n");

                        mBM.printArray(listado);
                        System.out.println("\nComparaciones -> " + resultado[0]);
                        System.out.println("Cambios -> " + resultado[1]);
                        break;
                    }

                default:
                    System.out.println("\n-----Opcion invalida-----");
                    break;
            }
        }
    }
//---------------------------------------------------------------------------------------------------------------------
    public static int getPositive(Scanner scanner , String message){  //Se debe estar en static para usarlo en el mismo
        int input;

        do{
            System.out.println(message + "->");
            input = scanner.nextInt();

            if (input <= 0){
                System.out.println(" El numero debe ser positivo" +
                    "\nIntente nuevamente");
            }

        }while(input <= 0);
        return input;
    }
//---------------------------------------------------------------------------------------------------------------------
    public static String getValisString(Scanner scanner , String [] posibles, String message){
        String input;
        boolean valido;

        do{
            System.out.println(message + "->");
            input = scanner.next();
            valido = false;

            for (String posible : posibles){
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }
        }while(!valido);
        return input;
    }
}
