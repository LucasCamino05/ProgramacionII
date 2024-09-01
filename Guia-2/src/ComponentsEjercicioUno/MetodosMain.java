package ComponentsEjercicioUno;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodosMain {
    public static String MenuPrincipal(String ejercicio, Scanner input){
        System.out.println("----- Menu -----");
        System.out.println("Ingrese el Ejercicio a Acceder");
        System.out.println("Ejercicio 1 - A");
        System.out.println("Ejercicio 2 - B");
        System.out.println("Ejercicio 3 - C");
        System.out.println("Ejercicio 4 - D");
        System.out.println("Ejercicio 5 - E");
        System.out.println("Salir - S");
        System.out.print("Ingrese su eleccion: ");
        ejercicio = input.nextLine();
        ejercicio = ejercicio.toLowerCase();
        return ejercicio;
    }
}
