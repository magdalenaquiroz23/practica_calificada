package colectiva;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double gastos = 0, totalgastos = 0;

        System.out.println("Ingrese su primer gasto (o ingrese 0 si no tiene ninguno):");
        gastos = entradaDatos.nextDouble();

        if (gastos == 0) {
            System.out.println("No tiene ningún gasto.");
        } else {
            // El bucle continuará mientras el usuario no ingrese un 0
            while (gastos != 0) {
                totalgastos = totalgastos + gastos;
                System.out.println("Mis gastos acumulados son: " + totalgastos);

                System.out.println("Ingrese su siguiente gasto (o 0 para salir):");
                gastos = entradaDatos.nextDouble();
            }
            System.out.println("Suma final de todos los gastos: " + totalgastos);
        }

        entradaDatos.close(); // El Scanner se cierra SIEMPRE al final de todo el programa
    }
}

