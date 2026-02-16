package Problema2;

import java.util.*;

public class Tienda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do{
            System.out.print("=====MOSTAR TIENDA=====");
            System.out.print("1.Mostrar productos disponibles");
            System.out.print("2.Agregar producto al carrito");
            System.out.print("3.Ver carrito y total");
            System.out.print("4.Finalizar compra");
            System.out.print("0.Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            try{
                switch(opcion){
                    case 1:

                    break;
                    
                    case 2:

                    break;

                    case 3:

                    break;

                    case 4:

                    break;

                    case 0:
                        System.out.println("Saliendo del programa...");
                    break;
                    default:
                        System.out.println("Error al ingresar la opcion");

                }
            }catch(StockInsuficienteException e);

        }while(opcion != 0);

        sc.close();
    }
}