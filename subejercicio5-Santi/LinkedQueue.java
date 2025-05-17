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
        Nodo<T> antiguoFinal = finalCola;
        finalCola = new Nodo<>(elemento);
        finalCola.siguiente = null;

        if(isEmpty()){
            finalCola = frente;
        }else{
            antiguoFinal.siguiente = finalCola;
        }
        tamaño++;

    }

    // Método para quitar (dequeue)
    public T dequeue() {
        if(isEmpty())
            throw new IllegalStateException("Empty queue");

        T elemento = frente.valor;
        frente = frente.siguiente;
        tamaño--;
        if(isEmpty()){
            finalCola = null;
        }

        return elemento;
    }

    // Método para ver el primero sin quitarlo (peek)
    public T peek() {
        if(isEmpty())
            throw new IllegalStateException();

        return frente.valor;
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
