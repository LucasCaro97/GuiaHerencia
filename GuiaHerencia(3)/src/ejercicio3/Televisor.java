/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author 54375
 */
public class Televisor extends Electrodomestico {
    
    private double pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnerg, double peso) {
        super(precio, color, consumoEnerg, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor(){
    super.crearElectrodomestico();
        System.out.println("Ingrese pulgadas del televisor:");
        pulgadas = entrada.nextDouble();
        System.out.println("Ingrese si tiene sintonizador: S/N") ;
        String sintonizador = entrada.next();
        if (sintonizador.equalsIgnoreCase("s")) {
            sintonizadorTDT = true;
        }else{
            sintonizadorTDT = false;
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(pulgadas > 40){
            super.precio = super.precio * 1.3 ;
        }
        if(sintonizadorTDT){
            super.precio = super.precio + 500;
        }
    }

       @Override
    public String toString() {
        return "Televisor{" + super.toString() + " pulgadas= " + pulgadas + "Sintonizador= " + sintonizadorTDT;
    }
    
    
    @Override
    public void mostrarPrecio(){
        System.out.println("Televisor: " + precio);
        
    }
    
    

    
}
