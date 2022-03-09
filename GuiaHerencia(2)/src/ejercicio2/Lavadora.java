/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;


public class Lavadora extends Electrodomestico {
    
    private double carga;

    public Lavadora() {
        
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumoEnerg, double peso) {
        super(precio, color, consumoEnerg, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    
    public void crearLavadora() {
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la carga de la lavadora:");
        carga = entrada.nextDouble();
        
    }

    
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(carga > 30){
            precio = precio + 500;
        }
    }

     @Override
    public String toString() {
        return "Lavadora{" + super.toString() + " carga= " + carga;
    }
    
    
    
    
    
}
