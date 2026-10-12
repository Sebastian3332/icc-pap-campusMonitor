package icc.pap.u01;

import com.google.common.base.Function;

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

    // Metodo generico

    public <R> R mapear(Function<T, R> operacion) {
        R resultado = operacion.apply(valor);
        return resultado;
    }

}
