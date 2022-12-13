import java.util.Scanner;

public class Practica_4 {
    public static void main(String[] args) {
        /*
            Pedir un número por teclad e idicar si es mayor que el otro o si son iguales.

         */

        Scanner sc = new Scanner(System.in); //Scanner para indicar valor
        System.out.println("Ingrese el primer número que desea comparar: ");
        int y = sc.nextInt();
        System.out.println("Ingrese el segundo número que desea comparar: ");
        int x = sc.nextInt();

        if (y <= x ){
            if (y == x){
                System.out.println("Son iguales");
            } else {
                System.out.println( x + " Es el número mayor");
            }
        } else {
            System.out.println(y + " Es el número mayor ");
        }
    }
}
