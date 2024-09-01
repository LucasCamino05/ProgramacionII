package ComponentsEjercicioUno;

public class EmpleadoContratista extends Empleado{
    protected int horas;
    private double tarifa;

    public EmpleadoContratista() {
        super();
        this.tarifa = 0;
        this.horas = 0;
    }
    public EmpleadoContratista(String nombre, double salario, int horas, double tarifa) {
        super(nombre, salario,3);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public double getTarifa() {
        return tarifa;
    }


    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
