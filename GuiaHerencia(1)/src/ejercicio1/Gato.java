/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author 54375
 */
public class Gato extends Animal {

    @Override
    public void alimentarse() {
        System.out.println("El gato se alimenta de: " +  super.alimento);
    }

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
}
