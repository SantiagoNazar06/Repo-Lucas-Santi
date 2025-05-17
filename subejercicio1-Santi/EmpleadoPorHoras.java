public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, double horas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horas;
        this.pagoPorHora = pagoPorHora;
    }

    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
