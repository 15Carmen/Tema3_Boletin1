package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Escribe un programa que vaya pidiendo al usuario números y muestre por pantalla si el número es par o impar
    (indistintamente que sea positivo o negativo). El algoritmo terminará cuando el usuario introduzca el
    número cero.
     */

    public static void main(String[] args) {
        //Decalramos las variables
        int num; //Variable donde vamos a guardar los numeros introducidos por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero y lo guardamos en la variable declarada previamente
        System.out.println("Introduzca un numero entero positivo (Cuando desee dejar de introducir numeros, introduzca un 0): ");
        num = sc.nextInt();

        while (num != 0){                       //Mientras el numero introducido por el usuario sea distinto de 0
            if ( num % 2 == 0 ){                //Si el modulo del módulo in
                System.out.println( "Es par" );
            }
            else {
                System.out.println( "Es impar" );
            }

            System.out.println("Introduzca otro numero: ");
            num= sc.nextInt();
        }
    }
}
