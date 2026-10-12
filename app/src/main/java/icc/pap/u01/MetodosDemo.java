package icc.pap.u01;

public class MetodosDemo {
    public static void main(String[] args) {
        Caja<String> original = new Caja<>("Algoritmo");

        // Mapear el valor String d ela CAJA a un Intreger

        Integer longitud = original.mapear(texto -> texto.length());
        String etiqueta = original.mapear(texto -> "Materia: " + texto);

        System.out.println("Original: " + original.obtener());
        System.out.println("Longitud: " + longitud);
        System.out.println(etiqueta);

    }
    
}
