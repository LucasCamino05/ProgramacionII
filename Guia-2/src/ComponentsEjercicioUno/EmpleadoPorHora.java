package ComponentsEjercicioUno;

public class EmpleadoPorHora extends Empleado{
    protected int horas;

    public EmpleadoPorHora() {
        super();
        this.horas = 0;
    }

    public EmpleadoPorHora(String nombre, double salario,int horas){
        super(nombre,salario,2);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

}
