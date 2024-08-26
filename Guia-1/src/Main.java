import java.util.Scanner;
import assets.BankAccount;
import assets.Empleado;

/*
1. Modele el objeto assets.Empleado que posee las siguientes características, dni,
nombre, apellido y salario. El mismo debe contar con la posibilidad de
calcular el salario anual. A su vez se requiere otro metodo que permita
aumentar el salario dependiendo del porcentaje que se le pase por
parámetro. Considere crear un metodo que facilite imprimir por pantalla las
características del objeto de la siguiente forma:
assets.Empleado[dni=?, nombre=?, apellido=?, salario=?]
En el main, realice las siguientes operaciones:
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial
de 25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla.
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.
 */

public class Main {
    public static void Menu(){
        System.out.println("----- Menu -----");
        System.out.println("Ejercicio 1 - (1)");
        System.out.println("Ejercicio 2 - (2)");
        System.out.println("Ejercicio 3 - (3)");
        System.out.print("Eleccion: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // OBJETOS CREADOS
        BankAccount persona = new BankAccount("Pedro", 15000);
        Empleado empleado1 = new Empleado("23456345", "Carlos", "Gutierrez", 25000);
        int salida;
        int opcion;

        do {
            Menu();

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(empleado1.mostrarObjeto());
                    System.out.print("Por favor ingrese el aumento: ");
                    double aumento = input.nextDouble();
                    input.nextLine();
                    double sueldo = empleado1.aumentarsueldo(aumento);
                    empleado1.setSalario(sueldo);
                    System.out.println(empleado1.mostrarObjeto());
                    break;
                case 2:
                    System.out.print("Ingrese el monto depositado: ");
                    double credito = input.nextInt();
                    input.nextLine();
                    persona.getCredito(credito);
                    System.out.println(persona.mostrarBalance());
                    System.out.print("Ingrese el monto de debitar: ");
                    double debito = input.nextDouble();
                    input.nextLine();
                    boolean operacion = persona.getDebito(debito);
                    if(operacion){
                        System.out.println("Su accion fue exitosa!");
                    }
                    else{
                        System.out.println("Monto insuficiente. Comuniquese con su proveedor.");
                    }
                    System.out.println(persona.mostrarBalance());
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor intente nuevamente.");
                    break;
            }
            System.out.println("Desea realizar otra actividad? Si(0) - No(1)");
            salida = input.nextInt();
            input.nextLine();

        }while(salida != 1);
        input.close();
    }
}