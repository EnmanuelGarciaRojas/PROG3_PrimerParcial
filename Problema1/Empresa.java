package Problema1;

import java.util.*;

public class Empresa {
    public static void main(String[] args){
        //Lits<Empleado> lista = new ArrayLits<>();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do{
            System.out.println("=====Menu=====");
            System.out.println("1.Agregar empleado");
            System.out.println("2.Mostrar empleados");
            System.out.println("3.Mostar total de nomina");
            System.out.println("0.Salir\n");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
            case 1:
                System.out.print("Nombre empleado: ");
                String nombre = sc.nextLine();

                System.out.print("Sueldo base: ");
                String sueldoBase = sc.nextLine();

                System.out.print("Tipo de empleado(Medio tiempo o Tiempo completo): ");
                sc.nextLine();

                System.out.print("Bono: ");
                sc.nextLine();

                System.out.print("Horas Trabajadas: ");
                sc.nextLine();

            break;
            
            case 2:


            break;

            case 3:
                System.out.println("===Total de nomina===");
                


            break;
            case 0:
                System.out.println("Saliendo del menu...");
            break;
        
            default:
                System.out.println("El numero debe estar en el rango de 0 a 3");
                break;
        }
        }while(opcion != 0);
    }
}
