/*
vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
 */
package ejercicio4;

/**
 *
 * @author 54375
 */
public interface calculosFormas {
    
    public final double PI = Math.PI;
    
    public double calcularArea();
    public double calcularPerimetro();
    
}
