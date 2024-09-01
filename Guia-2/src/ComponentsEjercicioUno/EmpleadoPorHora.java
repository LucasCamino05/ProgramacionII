package Components;

public class EmpleadoPorHora extends Empleado{
    private int horas;
    public EmpleadoPorHora() {
        super();
        this.horas = 0;
    }

    public EmpleadoPorHora(String nombre, double salario,int horas){
        super(nombre,salario);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
}
