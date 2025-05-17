import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> productos = new HashMap<>();

    /**
     * Agrega cierta cantidad de un producto al inventario.
     * Si la cantidad es negativa, lanzar IllegalArgumentException.
     */
    public void agregarProducto(String nombre, int cantidad) {
        if(cantidad < 0)
            throw new IllegalArgumentException("Cantidad negativa");

        productos.put(nombre, productos.getOrDefault(nombre, 0) + cantidad);
    }

    /**
     * Extrae una cantidad del producto indicado.
     * Si no hay suficiente cantidad o el producto no existe, lanzar IllegalArgumentException.
     */
    public void extraerProducto(String nombre, int cantidad) {
        if(cantidad > productos.get(nombre))
            throw new IllegalArgumentException("No se puede extraer una cantidad mayor a la existente");
        if(!productos.containsKey(nombre))
            throw new IllegalArgumentException("Producto inexistente");

        productos.put(nombre, productos.get(nombre)-cantidad);
    }

    /**
     * Devuelve la cantidad disponible del producto.
     * Si no está en el inventario, devolver 0.
     */
    public int consultar(String nombre) {
        if(!productos.containsKey(nombre)){
            return 0;
        }

        return productos.get(nombre);
    }
}
