import java.util.Scanner;

public class SistemaFidelizacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de la compra (en pesos): ");
        double cantidadCompra = scanner.nextDouble();

        int puntosAcumulados = (int) (cantidadCompra / 10);

        String nivelFidelizacion;
        if (puntosAcumulados <= 100) {
            nivelFidelizacion = "Bronce";
        } else if (puntosAcumulados <= 500) {
            nivelFidelizacion = "Plata";
        } else if (puntosAcumulados <= 1000) {
            nivelFidelizacion = "Oro";
        } else {
            nivelFidelizacion = "Platino";
        }

        System.out.println("Nivel de fidelización: " + nivelFidelizacion);

        if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
            System.out.println("Usted tiene un descuento del 10% en su próxima compra.");
        }

        if (nivelFidelizacion.equals("Platino")) {
            System.out.println("Usted ha ganado un regalo especial: un cupón para un producto.");
        }
    }
}