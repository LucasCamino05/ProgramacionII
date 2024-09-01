package Components;

import java.util.Scanner;

public class MetodosMain {
    public static char MenuPrincipal(char ejercicio, Scanner input){
        System.out.println("----- Menu -----");
    }
    public static int MenuPrincipalEjercicioUno(int opcion, Scanner input){
        System.out.println("----- Menu -----");
        System.out.println("Ingresar nuevo Empleado de Tiempo Completo (1)");
        System.out.println("Ingresar nuevo Empleado por Hora (2)");
        System.out.println("Ingresar nuevo Empleado Contratista (3)");
        System.out.println("Calcular Salario (4)");
        System.out.println("Ingresar horas trabajadas (5)");
        System.out.println("Salir (0)");
        System.out.print("Ingrese su eleccion: ");
        opcion = input.nextInt();
        input.nextLine();
        return opcion;
    }

    public static EmpleadoTiempoCompleto PedirDatos(Scanner input,EmpleadoTiempoCompleto usuario){

        System.out.print("Nombre Completo: ");
        usuario.setNombre(input.next());
        System.out.print("Salario: ");
        usuario.setSalario(input.nextDouble());
        input.nextLine();

        return usuario;
    }
    public static EmpleadoPorHora PedirDatos(Scanner input,EmpleadoPorHora usuario,int horas){

        System.out.print("Nombre Completo: ");
        usuario.setNombre(input.next());
        System.out.print("Salario: ");
        usuario.setSalario(input.nextDouble());
        input.nextLine();
        System.out.print("Horas: ");
        usuario.setHoras(input.nextInt());
        input.nextLine();
        return usuario;
    }
    public static EmpleadoContratista PedirDatos(Scanner input,EmpleadoContratista usuario,int horas,double tarifa){

        System.out.print("Nombre Completo: ");
        usuario.setNombre(input.next());
        System.out.print("Tarifa: ");
        usuario.setTarifa(input.nextDouble());
        input.nextLine();
        System.out.print("Salario: ");
        usuario.setSalario(input.nextDouble());
        input.nextLine();
        System.out.print("Horas: ");
        usuario.setHoras(input.nextInt());
        input.nextLine();
        return usuario;
    }
}
