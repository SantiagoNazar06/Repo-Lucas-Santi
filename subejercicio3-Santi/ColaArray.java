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

        if(estaVacia()){
            frente = fin;
            tamaño++;
        }
        tamaño++;
    }

    public T desencolar() {
        T elementoDesencolado = datos[frente];
        datos[frente] = null;
        frente = (frente +1) % datos.length;
        tamaño--;
        if(estaVacia()){
            frente = fin;
        }
        return elementoDesencolado;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }
}
