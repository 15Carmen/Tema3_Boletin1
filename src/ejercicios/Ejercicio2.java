package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando. Cuando
    el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes de acabar,
    mostrará la cantidad de números positivos introducidos por el usuario.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int num;          //Variable donde vamos a guardar el numero introducido por el usuario
        int contador = 0; //Variable donde vamos a guardar el numero de veces que introducimos un número positivo

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero positivo y lo guardamos en la variable declarada previamente
        System.out.println("Introduzca un numero entero positivo (cuando desee de introducir numeros, introduzca uno negativo): ");
        num = sc.nextInt();


        while (num >= 0) {         //Mientras el numero introducido sea menor o igual que 0
            contador++;            //incrementamos el contador en 1
                                   //y le pedimos al usuario que introduzca otro número
            System.out.println("Introduzca otro numero : ");
            num = sc.nextInt();
        }

        //Cuando salgamos del bucle, mostramos por pantalla la cantidad de números positivos introducidos
        System.out.println("La  cantidad de numeros enteros positivos introducidos es " + contador);

        //Cerramos el scanner
        sc.close();
    }
}
