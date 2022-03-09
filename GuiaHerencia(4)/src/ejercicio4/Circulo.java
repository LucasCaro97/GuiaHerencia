
package ejercicio4;

/**
 *
 * @author 54375
 */
public class Circulo implements calculosFormas{

    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public Circulo() {
    }
    


    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.

    @Override
    public double calcularArea() {
        return  Math.pow(PI * (diametro / 2), 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * diametro;
    }
}
