package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
    Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes
    de acabar, mostrará la suma de los números positivos introducidos por el usuario.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int num;        //Variable que va a introducir el usuario
        int suma = 0;   //Variable donde el usuario va a introducir el numero a sumar

        //Decalramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número positivo y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero (cuando desee de introducir numeros, introduzca uno negativo): ");
        num = sc.nextInt();

        while (num >= 0) {      //Mientras el numero introducido sea mayor o igual que 0
            suma+=num;          //A la variable suma (que al inicio del programa es 0) le sumamos el numero introducido
                                //Le pedimos al usuario que introduzca otro número para sumarlo y lo guardamos en la variable num
            System.out.println("Introduzca un numero que sumarle: ");
            num = sc.nextInt();

        }
        //Cuando salga del bucle mostramos por pantalla la variable suma, ya que es a la que le hemos ido sumando todos los
        //números que hemos ido introduciendo
        System.out.println("El resultado de la suma de todos los numeros introducidos es: "+suma);

        //Cerramos el scanner
        sc.close();
    }
}
