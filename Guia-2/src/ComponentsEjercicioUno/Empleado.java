package ComponentsEjercicioUno;

public class Empleado {
    private static int ID = 0;
    private int empleadoID;
    private String nombre;
    private double salario;
    private int TipoEmpleado;

    // Constructores
    public Empleado() {
        this.empleadoID = ++ID;
        this.nombre = null;
        this.salario = 0;
        this.TipoEmpleado =  0;
    }

    public Empleado(String nombre, double salario,int TipoEmpleado) {
        this.empleadoID = ++ID;
        this.nombre = nombre;
        this.salario = salario;
        this.TipoEmpleado = TipoEmpleado;
    }

    // Getters
    public int getEmpleadoID() {
        return empleadoID;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getTipoEmpleado() {
        return TipoEmpleado;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Methods
    public double calcularPago(double salarioHora,int horas){
        return (salarioHora*horas*30);
    }
    public double calcularPago(double salarioDia){
        return (salarioDia*30);
    }
    public double calcularPago(double salarioBase,int horas, double salarioHora){
        return (salarioBase + (horas*salarioHora));
    }
}
