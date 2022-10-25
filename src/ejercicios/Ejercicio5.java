package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero). Cuando acabe
    de insertar los números, el algoritmo debe mostrar la suma de los números positivos, la media de los números negativos
    y el número de ceros que ha introducido el usuario.
     */

    public static void main(String[] args) {
        int num;
        int suma = 0;
        int sumaNega = 0;
        int contador = 0;
        int contador0 = 0;
        int contadorNega = 0;
        int media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        num = sc.nextInt();

        while(contador<=10){
            contador++;

            if (num<0){

            } else if (num>0){

            } else {
                contador0++;
            }

            System.out.println("Introduzca otro numero");
            num = sc.nextInt();
        }

        System.out.println("La suma de los numeros positivos introducidos es: "+suma);
        System.out.println("La media de los numeros negativos introducidos es: "+media);
        System.out.println("La cantidad de 0 introducidos es: "+contador0);


    }
}
