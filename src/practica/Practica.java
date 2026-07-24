package practica;

import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] gastos = new double[20];
        int cantidad = 0;
        int opcion;

        do {
            System.out.println("1.Registrar 2.Mostrar 3.Total 4.Promedio 5.Mayor 6.Menor 7.Salir");
            opcion = sc.nextInt();

            if (opcion == 1 && cantidad < gastos.length) {
                System.out.print("Monto: ");
                gastos[cantidad++] = sc.nextDouble();
            } else if (opcion == 2) {
                for (int i = 0; i < cantidad; i++) System.out.println((i+1) + ". S/ " + gastos[i]);
            } else if (opcion == 3 || opcion == 4) {
                double total = 0;
                for (int i = 0; i < cantidad; i++) total += gastos[i];
                if (opcion == 3) System.out.println("Total: S/ " + total);
                else System.out.println("Promedio: S/ " + (cantidad > 0 ? total / cantidad : 0));
            } else if (opcion == 5 || opcion == 6) {
                double resultado = gastos[0];
                for (int i = 1; i < cantidad; i++) {
                    if (opcion == 5 && gastos[i] > resultado) resultado = gastos[i];
                    if (opcion == 6 && gastos[i] < resultado) resultado = gastos[i];
                }
                System.out.println((opcion == 5 ? "Mayor: S/ " : "Menor: S/ ") + resultado);
            } else if (opcion == 7) {
                System.out.println("Adios!");
            }

        } while (opcion != 7);

        sc.close();
    }
}