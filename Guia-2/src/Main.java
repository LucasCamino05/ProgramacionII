import ComponentsEjercicioUno.*;
import ComponentesEjercicioDos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Ejercicio_Uno(Scanner input){
        int opcion = 0;

        ArrayList<Empleado> EMPLEADOS = new ArrayList<>();
        EmpleadoPorHora usuarioPorHora = new EmpleadoPorHora();
        EmpleadoTiempoCompleto user = new EmpleadoTiempoCompleto();
        EmpleadoContratista usuarioContratista = new EmpleadoContratista();
        do{
            opcion = EjercicioUnoMetodos.MenuPrincipalEjercicioUno(opcion,input);

            switch (opcion){
                case 1:
                    user = EjercicioUnoMetodos.PedirDatos(input,user);
                    EMPLEADOS.add(user);
                    break;
                case 2:
                    usuarioPorHora = EjercicioUnoMetodos.PedirDatos(input,usuarioPorHora,usuarioPorHora.getHoras());
                    EMPLEADOS.add(usuarioPorHora);
                    break;
                case 3:
                    usuarioContratista = EjercicioUnoMetodos.PedirDatos(input,usuarioContratista,usuarioContratista.getHoras(),usuarioContratista.getTarifa());
                    EMPLEADOS.add(usuarioContratista);
                    break;
                case 4:
                    String eleccion = EjercicioUnoMetodos.CalcularSalario(EMPLEADOS,input);
                    if(eleccion == null){
                        System.out.println("Comuniquese con un Administrador.");
                    }
                    else{
                        System.out.println(eleccion);
                    }
                    break;
                case 5:

                    break;
                case 6:
                    if(EMPLEADOS.isEmpty()){
                        System.out.println("Comuniquese con un Administrador.");
                    }
                    else {
                        for (Empleado e : EMPLEADOS) {
                            System.out.println("Nombre: " + e.getNombre() + "\nID: " + e.getEmpleadoID());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro servicio.");
                    break;
                default:
                    System.out.println("Intente nuevamente.");
                    break;
            }
        }while(opcion != 0);
    }
    public static void Ejercicio_Dos(Scanner input){
        Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com",'M');
        Libros libro1 = new Libros("Effective Java",450,150,autor1);
        libro1.
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ejercicio = null;

        do{
            ejercicio = MetodosMain.MenuPrincipal(ejercicio,input);
            switch(ejercicio){
                case "a":
                    Ejercicio_Uno(input);
                    break;
                case "b":
                    Ejercicio_Dos(input);
                    break;
            }
        }while(!ejercicio.equals("s"));
        input.close();
    }
}