package colectiva;
import java.util.Scanner;

public class Problemas {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("Ingrese el monto de su compra: ");
        double montocompra = entradaDatos.nextDouble(); // Corregido: nextDouble() para números
        entradaDatos.nextLine(); // Limpiar el buffer del Scanner

        System.out.println("¿Tiene una membresía? si o no: ");
        String descuento = entradaDatos.nextLine().toLowerCase();

        // Verifica si la compra aplica para descuento (mayor o igual a 500)
        if (montocompra >= 500) {
            System.out.println("¡Felicidades! Aplicas para un descuento.");

            double totalPagar;
            if (descuento.equalsIgnoreCase("si")) {
                totalPagar = montocompra * 0.80; // 20% de descuento (paga el 80%)
                System.out.println("Tu descuento es del 20%. Total a pagar: " + totalPagar);
            } else {
                totalPagar = montocompra * 0.90; // 10% de descuento (paga el 90%)
                System.out.println("Tu descuento es del 10%. Total a pagar: " + totalPagar);
            }
        } else {
            System.out.println("No aplicas a ningún descuento. Total a pagar: " + montocompra);
        }

        entradaDatos.close();
    } // Cierre del método main
} // Cierre de la clase Problemas

