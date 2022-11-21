package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    Escribe un programa que pida por teclado un número entero mayor o igual que 0
    y determine cuántas de sus cifras son pares y cuántas son impares:
    Realiza también el diagrama de flujo de este programa y una serie de capturas
    donde se vea la depuración del programa durante al menos 3 iteraciones del
    bucle

    --Pruebas--
    [1] Introducir un 0 y que lance un mensaje de error
    num=0
        RE -> "Numero no válido, debe ser mayor que 0"
        RO -> "Numero no válido, debe ser mayor que 0"
    [2] Introducir un numero solo con impares
    num=1111
        RE -> El numero tiene 0 cifras pares y 4 cifras impares
        RO -> El numero tiene 0 cifras pares y 4 cifras impares

    [3] Introducir un numero solo con pares
    num=2222
        RE -> El numero tiene 4 cifras pares y 0 cifras impares
        RO -> El numero tiene 4 cifras pares y 0 cifras impares

    [4] Introducir un numero cualquiera
    num=12345
        RE -> El numero tiene 2 cifras pares y 3 cifras impares
        RO -> El numero tiene 2 cifras pares y 3 cifras impares

     */

    public static void main(String[] args) {
        //Declaracion de variables
        int num;                           //Variable donde guardamos el numero introducido por el usuario
        int unidad;                        //Variable donde guardamos la ultima cifra del numero introducido
        int contadorCifrasPares = 0;       //Contador de los numero pares
        int contadorCifrasImpares = 0;     //Contador de los numeros impares

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero y lo guardamos en la variable num
        System.out.println("Introduzca un numero entero: ");
        num= sc.nextInt();

        if (num <= 0) {                 //Si el numero introducido es menor que 0 imprimimos un mensaje de error
            System.out.println("Numero no válido, debe ser mayor que 0");
        } else {                      //Si no lo es
            while (num > 0) {         //Mientras el numero sea mayor que 0
                unidad = num % 10;    //guardamos en la variable unidad la ultima cifra
                num /= 10;            //y vamos dividiendo el numero entre 10

                if (unidad%2==0){           //Si el resto de la division de la unidad entre 2 es igual a 0
                    contadorCifrasPares++;  //El numero es par por lo que añadimos uno al contador de pares
                }else {                     //Si no
                    contadorCifrasImpares++;//Añadimos 1 al contador de impares
                }
            }
            //Imprimimos por pantalla el resultado
            System.out.println("El numero tiene "+contadorCifrasPares+" cifras pares y "+contadorCifrasImpares+" cifras impares");

        }

        //Cerramos el scanner
        sc.close();

    }
}
