public class LinkedQueue<T> {

    // Nodo interno
    private static class Nodo<T> {
        T valor;
        Nodo<T> siguiente;

        Nodo(T valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    // Punteros al frente y final de la cola
    private Nodo<T> frente;
    private Nodo<T> finalCola;
    private int tamaño;

    // Constructor
    public LinkedQueue() {
        frente = null;
        finalCola = null;
        tamaño = 0;
    }

    // Método para agregar (enqueue)
    public void enqueue(T elemento) {
        // implementar
    }

    // Método para quitar (dequeue)
    public T dequeue() {
        // implementar
    }

    // Método para ver el primero sin quitarlo (peek)
    public T peek() {
        // implementar
    }

    // Verificar si está vacía
    public boolean isEmpty() {
        return tamaño == 0;
    }

    // Devolver tamaño
    public int size() {
        return tamaño;
    }
}
