package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero). Cuando acabe
    de insertar los números, el algoritmo debe mostrar la suma de los números positivos, la media de los números negativos
    y el número de ceros que ha introducido el usuario.
     */

    public static void main(String[] args) {

        //Declarmos las variables
        int num;                    //Variable donde vamos a guardar los numeros introducidos por el usuario
        int suma = 0;               //Variable donde el usuario va a guardar los numeros positivos a sumar
        double sumaNegativos = 0;   //Variable donde el usuario va a guardar los numeros negativos a sumar
        int contador = 1;           //Variable contador donde vamos a almacenar la cantidad de veces que se va introducir un número
        int contador0 = 0;          //Variable contador donde vamos a almacenar la cantidad de veces que el usuario ha introducido un 0
        int contadorNegativos = 0;  //Variable contador donde vamos a almacenar la cantidad de veces que el usuario introduce un numero negativo
        double media;               //Variable donde vamos a guardar el resultado de la media de los numeros negativos introducidos

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);



        while (contador < 10) {                                     //Mientras que el contador de numeros sea menor que 10
            System.out.println("Introduzca un numero: ");           //Le pedimos al usuario que introduzca un número entero cualquiera y lo guardamos en la variable num
            num = sc.nextInt();

            if (num > 0) {                                          //Si el numero introducido es mayor que cero
                suma += num;                                        //Vamos sumándole a la variable suma (que al inicio del programa vale 0) los numeros positivos introducidos
            } else if (num < 0) {                                   //Si el numero introducido es menor que cero
                sumaNegativos += num;                               //Vamos sumándole a la variable sumaNegativos (que al inicio del programa vale 0) los numeros negativos introducidos
                contadorNegativos++;                                //incrementamos el contador de numeros negativos en 1
            } else {                                                //Si el numero introducido es igual a 0
                contador0++;                                        //Incrementamos en 1 el contador de ceros
            }

            contador++;                                             //Incrementamos el contador de numeros introducidos en 1
        }

        media = sumaNegativos / (double) contadorNegativos;         //Calculamos la media de los numeros negativos

        //iimprimimos por pantalla la suma de los numeros positivos, la media de los negtivos y la cantidad de 0
        System.out.println("La suma de los numeros positivos introducidos es: " + suma);
        System.out.println("La media de los numeros negativos introducidos es: " + media);
        System.out.println("La cantidad de 0 introducidos es: " + contador0);

        //Cerramos el scanner
        sc.close();

    }
}
