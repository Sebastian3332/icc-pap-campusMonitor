package icc.pap.u01;


// Clase generica
public class Caja<T> { 

    // Dato generico
    private final T valor;

    public Caja(T valor) {
        this.valor = valor;
    }

    // Metodo generico
    // GETTER

    public T obtener() {
        return valor;
    }
}
