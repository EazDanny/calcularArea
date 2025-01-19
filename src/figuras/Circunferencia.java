package figuras;

/**
 * @author Daniel Alonso Farrugia 1DAMN-B
 * @version 1.0
 */
public class Circunferencia {
    private double radio;
    private String color;

    /**
     * Constructor de la clase Circunferencia.
     *
     * @param radio El radio de la circunferencia.
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Imprime las propiedades de la circunferencia: diámetro, color y área.
     * El color se inicializa como "rojo".
     */
    public void imprimir() {
        this.color = "rojo";
        System.out.println("Diámetro: " + 2 * radio);
        System.out.println("Color: " + this.color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * Compara si esta circunferencia tiene el mismo radio que otra.
     *
     * @param considerarDecimales Indica si se deben considerar los decimales en la comparación.
     * @param otro La otra circunferencia para comparar.
     * @return verdadero si los radios son iguales según la condición programada o falso en caso contrario.
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            return radio1 == radio2;
        } else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }

    /**
     * Obtiene el radio de la circunferencia.
     *
     * @return El radio de la circunferencia.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio de la circunferencia.
     *
     * @param radio El nuevo valor del radio.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
