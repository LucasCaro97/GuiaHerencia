/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:

 */
package ejercicio2;

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
}
