package figuras;

/**
 * @author Daniel Alonso Farrugia
 * @version 1.0
 */
public class Test {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     *
     * Este método crea tres objetos de la clase Circunferencia con diferentes
     * radios y utiliza el método esIgual para comparar dos de ellos, mostrando
     * si son iguales o no, considerando o no los decimales.
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }
}
