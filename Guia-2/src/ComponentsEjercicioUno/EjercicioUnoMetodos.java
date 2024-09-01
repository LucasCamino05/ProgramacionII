package ComponentsEjercicioUno;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioUnoMetodos {
    public static int MenuPrincipalEjercicioUno(int opcion, Scanner input){
        System.out.println("----- Menu -----");
        System.out.println("Ingresar nuevo Empleado de Tiempo Completo (1)");
        System.out.println("Ingresar nuevo Empleado por Hora (2)");
        System.out.println("Ingresar nuevo Empleado Contratista (3)");
        System.out.println("Calcular Salario (4)");
        System.out.println("Ingresar horas trabajadas (5)");
        System.out.println("Mostrar IDs (6)");
        System.out.println("Salir (0)");
        System.out.print("Ingrese su eleccion: ");
        opcion = input.nextInt();
        input.nextLine();
        return opcion;
    }

    public static EmpleadoTiempoCompleto PedirDatos(Scanner input,EmpleadoTiempoCompleto usuario){

        System.out.print("Nombre Completo: ");
        usuario.setNombre(input.nextLine());
        System.out.print("Salario: ");
        usuario.setSalario(input.nextDouble());
        input.nextLine();

        return usuario;
    }
    public static EmpleadoPorHora PedirDatos(Scanner input,EmpleadoPorHora usuario,int horas){

        System.out.print("Nombre Completo: ");
        usuario.setNombre(input.nextLine());
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
        usuario.setNombre(input.nextLine());
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

    //Supongo que todos los empleados conocen su ID.
    //Busco al Empleado y lo devuelvo.
    public static Empleado buscadorEmpleado(ArrayList<Empleado> EMPLEADOS,Scanner input){
        int ID;
        System.out.print("Ingrese el ID del empleado: ");
        ID = input.nextInt();
        for(Empleado e : EMPLEADOS){
            if(e.getEmpleadoID() == ID) {
                return e;
            }
        }
        return null;
    }
    //Calculo el salario
    public static String CalcularSalario(ArrayList<Empleado> EMPLEADOS,Scanner input){
            Empleado e;
            String respuesta = null;
            if(EMPLEADOS.isEmpty()){
                return null;
            }
            else{
                e = buscadorEmpleado(EMPLEADOS,input);
                if(e == null){
                    respuesta = ("Error - Usuario no encontrado.");
                }
                else{
                    //Preguntarle a Pato.
                    switch (e.getTipoEmpleado()){
                        case 1:
                            if(e instanceof EmpleadoTiempoCompleto) {
                                respuesta = ("Nombre: " + e.getNombre() + " Salario Mensual: " + e.calcularPago(e.getSalario()) + "$");
                            }
                            break;
                        case 2:
                            if(e instanceof EmpleadoPorHora) {
                                respuesta = ("Nombre: " + e.getNombre() + " Salario Mensual: " + e.calcularPago(e.getSalario(),((EmpleadoPorHora) e).getHoras()) + "$");
                            }
                            break;
                        case 3:
                            if(e instanceof EmpleadoContratista) {
                                respuesta = ("Nombre: " + e.getNombre() + " Salario Mensual: " + e.calcularPago(((EmpleadoContratista) e).getTarifa(),((EmpleadoContratista) e).getHoras(),e.getSalario()) + "$");
                            }
                            break;
                }
            }
        }
            return respuesta;
    }
}
