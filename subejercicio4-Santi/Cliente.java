public class Cliente extends Persona {
    private int compras;

    public Cliente(String nombre, int compras) {
        super(nombre);
        this.compras = compras;
    }

    public String generarReporte() {
        return "Cliente: " + nombre + ", compras: " + compras;
    }
}