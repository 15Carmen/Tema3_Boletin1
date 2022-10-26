package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando. Cuando el
    usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes de acabar,
    mostrará la media de los números positivos introducidos por el usuario.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int num;            //Variable donde guardamos los números introducidos por el usuario
        int suma = 0;       //Variable donde guardamos la suma de los números que se van introduciendo
        int contador = 0;   //Variable donde guardamos el número de veces que el usuario introduce un número positivo
        double media;      //Variable donde vamos a guardar la media de la suma de los números
        
        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero positivo y lo guardamos en la variable declarada previamente
        System.out.println("Introduzca un numero entero positivo (Cuando desee dejar de introducir numeros, introduzca uno negativo): ");
        num = sc.nextInt();
        
        while (num>=0){                                         //Mientras el número introducido sea mayor o igual que 0
            suma +=num;                                         //A la variable suma le sumamos los numeros introducidos por el usuario
            contador++;                                         //e incrementamos el contador en 1
            System.out.println("Introduzca otro número: ");     //Le pedimos al usuario que introduzca otro número
            num= sc.nextInt();                                  //y lo volvemos a guardar en la variable num
        }
        media=(double)suma/(double)contador;                    //finalmente calculamos la media de los números introducidos que es
                                                                // el total de la suma los números entre la cantidad de veces que se ha introducido un número

        //Imprimimos por consola la media de los números introducidos
        System.out.println(suma);
        System.out.println(contador);
        System.out.println("La media de los numeros introducidos es "+media);
        
        //Cerramos el scanner
        sc.close();
    }
}
