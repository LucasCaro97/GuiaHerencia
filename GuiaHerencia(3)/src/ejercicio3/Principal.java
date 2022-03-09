/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author 54375
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double contador = 0;
        ArrayList<Electrodomestico> listaElectr = new ArrayList();
        
        Lavadora lavadora1 = new Lavadora(20, 10000, "blanco", 'F', 60);
        Lavadora lavadora2 = new Lavadora(20, 10000, "negro", 'E', 60);
        Televisor televisor1 = new Televisor(48, true, 20000, "negro", 'B', 15);
        Televisor televisor2 = new Televisor(42, false, 20000, "gris", 'C', 15);
        
        listaElectr.add(lavadora1);
        listaElectr.add(lavadora2);
        listaElectr.add(televisor1);
        listaElectr.add(televisor2);
        
        System.out.println("ELECTRODOMESTICOS");
        System.out.println(lavadora1);
        System.out.println(lavadora2);
        System.out.println(televisor1);
        System.out.println(televisor2);
        
        System.out.println("PRECIOS FINALES");
        for (Electrodomestico element : listaElectr) {
            element.precioFinal();
            element.mostrarPrecio();
            contador = contador + element.precio;
        }
        
        System.out.println("SUMA ELECTRODOMESTICOS: " + contador);
    }
    
}
