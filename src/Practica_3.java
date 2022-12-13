import java.util.Scanner;

public class Practica_3 {
    //Indicar si un número es par o no

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int num = number.nextInt();

        if(num % 2 == 0){
            System.out.println("Es par el " + num);
        } else {
            System.out.println("Es impar el numero " + num);
        }


    }
}
