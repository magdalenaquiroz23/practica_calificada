package bucles;

public class mientras {
    public static void main(String[] args) {
        System.out.println("Imprimiendo números del 0 al 10:");

        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            contador++; // Incrementa el contador en 1 para evitar un bucle infinito
        }
    }
}
