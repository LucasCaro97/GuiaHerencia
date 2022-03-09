/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author 54375
 */
public class Principal {

    
    public static void main(String[] args) {
    
        Rectangulo rectangulo = new Rectangulo(10, 20);
        Circulo circulo = new Circulo(50);
        
        System.out.println("RECTANGULO");
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("CIRCULO");
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("Area: " + circulo.calcularArea());
    
    }
    
}
