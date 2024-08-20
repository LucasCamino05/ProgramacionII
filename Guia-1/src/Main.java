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
    public static void main(String[] args) {
        /*
        Empleado empleado1 = new Empleado("23456345","Carlos","Gutierrez",25000);
        empleado1.mostrarObjeto();
        double sueldo = empleado1.aumentarsueldo();
        empleado1.setSalario(sueldo);
        empleado1.mostrarObjeto();
         */

        BankAccount persona = new BankAccount("Pedro",15000);
        persona.getCredito();

    }
}