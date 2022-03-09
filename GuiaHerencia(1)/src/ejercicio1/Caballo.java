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
public class Caballo extends Animal {

    @Override
    public void alimentarse() {
        System.out.println("El caballo se alimenta de: " +  super.alimento);
    }

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
}
