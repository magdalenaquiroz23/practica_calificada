package colectiva;
import java.util.Scanner;
public class Anidades {
    public static void main(String[] args) {
        Scanner entradaDatos= new Scanner(System.in);
        System.out.println("ingrese una calificacion: ");
        int calificacion = entradaDatos.nextInt();

        if (calificacion >=13){



            System.out.println("has aprobado");
            if(calificacion >=15){
                System.out.println("obtuviste una calificaciion");
            }
        }else {
            System.out.println("has reprovado el curso");

        }
    }
}
