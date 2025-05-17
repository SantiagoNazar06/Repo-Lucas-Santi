import java.util.List;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();

    public void imprimirBonificados(List<Empleado> empleados) {
    for (Empleado emp : empleados) {
        if(emp instanceof EmpleadoPorHoras){
            if(((EmpleadoPorHoras) emp).getHorasTrabajadas() > 40){
                System.out.println(emp.calcularSueldo());
            }
        }
    }
}

}
