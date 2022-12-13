import java.util.Scanner;

public class Practica_2 {
    //Lee un número por teclado y muestre por consola, el carácter al que pertenece en la tala ASCII,
    //Por ejemplo: SI Introduzco un 97, me muestre a.
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int  numero = an.nextInt();

        char caracter = (char) numero;
        System.out.println("El numero es: " + numero + " coresponde al carácter " + caracter);
    }


}
