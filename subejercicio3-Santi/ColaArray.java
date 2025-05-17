public class ColaArray<T> {
    private T[] datos;
    private int frente;
    private int fin;
    private int tamaño;

    public ColaArray(int capacidad) {
        datos = (T[]) new Object[capacidad];
        frente = 0;
        fin = 0;
        tamaño = 0;
    }

    public void encolar(T elem) {
        if(datos.length == tamaño)
            throw new IllegalStateException("Cola llena");
        
        datos[fin] = elem;
        fin = (fin+1) % datos.length;
        tamaño++;
    }

    public T desencolar() {
        if(estaVacia())
            throw new IllegalStateException("Cola vacia");

        T elementoDesencolado = datos[frente];
        datos[frente] = null;
        tamaño--;
        frente = (frente +1) % datos.length;
        return elementoDesencolado;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }
}
