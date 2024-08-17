/*
1. Modele el objeto Empleado que posee las siguientes características, dni,
nombre, apellido y salario. El mismo debe contar con la posibilidad de
calcular el salario anual. A su vez se requiere otro metodo que permita
aumentar el salario dependiendo del porcentaje que se le pase por
parámetro. Considere crear un metodo que facilite imprimir por pantalla las
características del objeto de la siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
En el main, realice las siguientes operaciones:
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial
de 25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla.
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.
 */

public class Empleado {
    class Empleado{
        // Atributos
        private String dni;
        private String nombre;
        private String apellido;
        private int salario;

        // Contrusctor vacio
        public Empleado() {
            this.dni = null;
            this.nombre = null;
            this.apellido = null;
            this.salario = 0;
        }

        public Empleado(String dni, String nombre, String apellido, int salario) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.salario = salario;
        }

        // Getters
        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getSalario() {
            return salario;
        }

        // Setters
        public void setDni(String dni) {
            this.dni = dni;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }

        // Methods

        public mostrarObjeto(){
            System.out.println("Empleado[dni="+dni+",nombre="+nombre+",apellido="+apellido+"salario="+salario);
        }
    }
}
