package ejercicio2;

public class Principal {

    public static void main(String[] args) {

        
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();

        lavadora.crearLavadora();
        televisor.crearTelevisor();

        System.out.println("PRODUCTOS");
        System.out.println(lavadora);
        System.out.println(televisor);

        lavadora.precioFinal();
        televisor.precioFinal();

        System.out.println("PRECIO FINAL");
        System.out.println(lavadora);
        System.out.println(televisor);
    }

}
