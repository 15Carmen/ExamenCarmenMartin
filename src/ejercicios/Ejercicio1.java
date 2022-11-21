package ejercicios;
/*
    Escribe un programa que lea un número entero (lado) y a partir de él cree un
    cuadrado de asteriscos con ese tamaño. Los asteriscos sólo se verán en el
    borde del cuadrado, no en el interior:

    *****
    *   *
    *   *
    *   *
    *****

    --Pruebas--

    [1] Introducir un numero menor o igual que cero y que lance un mensaje de error
        lado=0
        Respuesta Esperada (RE) -> "Error, numero introducido no válido, debe ser positivo"
        Respuesta Obtenida (RO) -> "Error, numero introducido no válido, debe ser positivo"

    [2] Introducir un numero cualquiera y que imprima en cuadrado
        lado=3
        RE -> ***       RO-> ***
              * *            * *
              ***            ***

 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaramos las variables
        int lado;               //Variable donde vamos a guardar el numero introducido por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca el numero de asteríscos que va a tener cada lado del caudrado
        System.out.println("Introduzca el numero de asteriscos que va a tener cada lado del cuadrado: ");
        lado = sc.nextInt();    //Lo guardamos en la variable lado

        if (lado <= 0) {        //Si el numero introducido por el usuario es menor o igual que 0 lanzamos un mensaje de error
            System.out.println("Error, numero introducido no válido, debe ser positivo");
        } else {
            for (int linea = 1; linea <= lado; linea++) {             //Inicializamos el primer bucle en 1, lo terminamos en el numero introducido por el usuario y lo incrementamos en 1

                for (int columna = 1; columna <= lado; columna++) {   //Inicializamos el segundo bucle en 1, lo terminamos en el numero introducido por el usuario y lo incremnetamos en 1

                    //Si linea es igual a 1 o a lado, o bien, columna es igual a 1 o a lado
                    if (linea == 1 || linea == lado || columna == 1 || columna == lado) {
                        System.out.print("*");  //Entonces imprimimos asterísco
                    } else { //Si no es el caso
                        System.out.print(" ");  //Imprimimos espacio en blanco
                    }
                }
                System.out.println();           //hacemos un salto para pasar a la impresión de la siguiente linea
            }
        }

        //Cerramos el scanner
        sc.close();
    }
}
