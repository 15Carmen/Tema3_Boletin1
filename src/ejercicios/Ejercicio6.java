package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    /*
    Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.
    Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
    la media, el número de alumnos y cuántos son mayores de edad.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int edad;
        int suma = 0;
        double media = 0;
        int contadorAlumnos = 0;
        int contadorMayoresEdad = 0;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca la edad de un alumno y lo guardamos en la variable edad
        System.out.println("Introduzca la edad de los alumnos (cuando quiera dejar de hacerlo introduzca un número negativo):");
        edad = sc.nextInt();


        while (edad > 0) {                                      //Mientras la edad introducida sea mayor que 0
            contadorAlumnos++;                                  //Incrementamos en 1 el contador de alumnos
            suma += edad;                                       //Sumamos las edades introducidas
            media = (double) suma / (double) contadorAlumnos;   //Calculamos la media dividiendo la suma de las edades entre el numero de alumnos introducidos
            if (edad >= 18) {                                   //Si la edad introducida es mayor o igual a 18
                contadorMayoresEdad++;                          //Incrementamos en 1 el contador de alumnos mayores de edad
            }

            System.out.println("Introduzca la edad de otro alumno: ");  //Le volvemos a pedir al usuario que introduzca una edad
            edad = sc.nextInt();                                        //Y la guardamos en la variable edad
        }

        //Imprimimos los resultados
        System.out.println("La suma de todas las edades es: " + suma);
        System.out.println("La media de las edades introducidas es: " + media);
        System.out.println("El número de alumnos introducidos es: " + contadorAlumnos);
        System.out.println("El número de alumnos que son mayores de edad es de: " + contadorMayoresEdad);

        //Cerramos el scanner
        sc.close();
    }
}
