package colectiva;
import java.util.Scanner; // Importación necesaria para leer datos

public class Membresia {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("¿Tiene la membresía de la APP? (si / no):");
        String tieneMembresia = entradaDatos.nextLine().toLowerCase();

        // Estructura simple para validar la membresía
        if (tieneMembresia.equals("si")) {
            System.out.println("¡Bienvenido! Tienes acceso a los beneficios VIP.");
        } else {
            System.out.println("Acceso estándar. ¡Regístrate para obtener beneficios!");
        }

        entradaDatos.close(); // Siempre cerramos el Scanner al final
    }
}
