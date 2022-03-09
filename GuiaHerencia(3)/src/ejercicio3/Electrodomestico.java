/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Electrodomestico {
    

    Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    protected double precio;
    protected String color;
    protected char consumoEnerg;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnerg, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(char consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra < 65 || letra > 70) {
            this.consumoEnerg = 'F';
        }
    }

    public void comprobarColor(String color) {

        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo")
                && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            this.color = "blanco";
        }

    }

    @Override
    public String toString() {
        return " precio= " + precio + " color= " + color + " consumo= " + consumoEnerg + " peso= " + peso;
    }

    public void crearElectrodomestico() {
        precio = 1000;

        System.out.println("Ingrese el precio del electrodomestico: ");
        precio = precio + entrada.nextInt();
        System.out.println("Ingrese el color del electrodomestico: ");
        color = entrada.next().toLowerCase();
        System.out.println("Ingrese el consumo energetico del electrodomestico: ");
        consumoEnerg = entrada.next().charAt(0);
        System.out.println("Ingrese el peso del electrodomestico: ");
        peso = entrada.nextDouble();

        comprobarConsumoEnergetico(consumoEnerg);
        comprobarColor(color);
    }

    public void precioFinal() {

        switch (consumoEnerg) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 800;
                break;
            case 'E':
                precio = precio + 500;
                break;
            case 'F':
                precio = precio + 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precio = precio + 100;
        }
        if (peso >= 20 && peso <= 49) {
            precio = precio + 500;
        }
        if (peso >= 50 && peso <= 79) {
            precio = precio + 800;
        }
        if (peso >= 80) {
            precio = precio + 1000;
        }

    }
    
    
    public void mostrarPrecio(){
        System.out.println("Lavadora: " + precio);
        
    }
}
