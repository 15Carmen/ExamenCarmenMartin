package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    Escribe un programa que vaya pidiendo al usuario los siguientes datos:
        ● Nombre del alumno/a.
        ● Nota de la parte práctica.
        ● Nota de la parte de problemas.
        ● Nota de la parte teórica.

    Si alguna de las notas introducidas no está entre 0 y 10 se le debe mostrar un
    mensaje de error al usuario y solicitar otro alumno. Todas las notas
    introducidas son enteras.

    La ponderación de las distintas notas es la siguiente:
        a. Parte práctica: 10%
        b. Parte de problemas: 50%
        c. Parte teórica: 40%
    NOTA: Hay que ir calculando la nota final de cada alumno atendiendo a las
    ponderaciones. La nota final debe ir con decimales.

    Si el usuario quiere dejar de introducir notas de alumnos, debe escribir
    un 0 cuando el programa le pida el nombre del siguiente alumno.

    Una vez se han recopilado las notas de todos los alumnos, el programa le
    mostrará un menú al usuario con las siguientes opciones:
        1. Nota máxima
        2. Nota mínima
        3. Media de las notas

    A continuación se explica cada una de las opciones:
        ● Nota máxima: Debe devolver tanto el nombre como la nota máxima
        del alumno que tiene la mayor nota de todas las introducidas.
        ● Nota mínima: Debe devolver tanto el nombre como la nota mínima del
        alumno que tiene la menor nota de todas las introducidas.
        ● Media de las notas: Debe devolver la media de todas las notas
        introducidas. Debe mostrarse con decimales


        --Pruebas--
        [1] Introducir una nota con un numero fuera del rango establecido
        notaPractica = 34
        RE -> "Error, las notas introducidas tienen que ser un numero entre 0 y 10"
        RO -> "Error, las notas introducidas tienen que ser un numero entre 0 y 10"

        [2] Introducir un notas validas y que me muestre la nota final
        notaPractica = 7, notaProblemas=8, notaTeorica=9
        RE -> notaFinal=8.3
        RO -> notafinal=8.3

        [3] Introducir un 0 cuando pida un nombre
        nombreAlumno=0
        RE -> Menu de opciones
        RO -> Menu de opciones

        [4] Despues de introducir varios datos, pedir la nota máxima
        nombreAlumno=Carmen, notaPractica = 7, notaProblemas=8, notaTeorica=9
            notaFinal= 8.3
        nombreAlumno=Lola, notaPractica = 1, notaProblemas=2, notaTeorica=4
            notaFinal= 2.7
        nombreAlumno=Isa, notaPractica = 4, notaProblemas=5, notaTeorica=6
            notaFinal= 5.7
        nombreAlumno=0

        opcion=3

        RE -> 8.3
        RO -> 8.3

        [3] Introducir un 0 cuando pida un nombre
        nombreAlumno=0
        RE -> Menu de opciones
        RO -> Menu de opciones

        [5] Despues de introducir varios datos, pedir la nota minima
        nombreAlumno=Carmen, notaPractica = 7, notaProblemas=8, notaTeorica=9
            notaFinal= 8.3
        nombreAlumno=Lola, notaPractica = 1, notaProblemas=2, notaTeorica=4
            notaFinal= 2.7
        nombreAlumno=Isa, notaPractica = 4, notaProblemas=5, notaTeorica=6
            notaFinal= 5.7
        nombreAlumno=0

        opcion=2

        RE -> 2.7
        RO -> 0.0
                ----PRUEBA FALLIDA----
        [6] Despues de introducir varios datos, pedir la media
        nombreAlumno=Carmen, notaPractica = 7, notaProblemas=8, notaTeorica=9
            notaFinal= 8.3
        nombreAlumno=Lola, notaPractica = 1, notaProblemas=2, notaTeorica=4
            notaFinal= 2.7
        nombreAlumno=Isa, notaPractica = 4, notaProblemas=5, notaTeorica=6
            notaFinal= 5.7
        nombreAlumno=0

        opcion=3

        RE -> 5.566666666666666
        RO -> 5.566666666666666

        [7] Despues de introducir varios datos, en el menu de opciones introducir una no valida
        nombreAlumno=Carmen, notaPractica = 7, notaProblemas=8, notaTeorica=9
            notaFinal= 8.3
        nombreAlumno=Lola, notaPractica = 1, notaProblemas=2, notaTeorica=4
            notaFinal= 2.7
        nombreAlumno=Isa, notaPractica = 4, notaProblemas=5, notaTeorica=6
            notaFinal= 5.7
        nombreAlumno=0

        opcion=7

        RE -> "Opcion no valida"
        RO -> "Opcion no valida"

     */

    public static void main(String[] args) {
        //Declaramos las varaibles
        String nombreAlumno = "";                       //Variable donde vamos a guardar el nombre del alumno introducido por el usuario
        int notaPractica, notaProblemas, notaTeorica;   //Variables donde vamos a guardar las diferentes notas del alumno introducidas por el usuario
        double notaFinal = 0;                           //Varaible donde vamos a guardar el calculo de la nota final del alumno
        double notaMax = 0, notaMin = notaFinal;        //Variables donde vamos a guardar las notas maximas y minimas
        double sumatorioNotas = 0;                      //variable donde vamos a guardar la suma de todas las notasFinales
        double mediaNotas = 0;                          //Variable donde vamos a guardar el calculo de la media de las notas
        int contador = 0;                               //Variable contador que vamos a usar para contar el numero de notas finales

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los datos de los alumnos. " +
                "Si quiere dejar de introducir datos escriba '0' cuando se le pida el nombre del alumno.");
        System.out.println();

        do {
            //Le pedimos al usuario que introduzca los datos que se le piden y los guardamos en sus respectivas variables
            System.out.println("Introduzca el nombre del alumno");
            nombreAlumno = sc.next();

            if (nombreAlumno.equals("0")) {
                break;
            }

            System.out.println("Introduzca la nota de la parte practica");
            notaPractica = sc.nextInt();

            System.out.println("Introduzca la nota de la parte de problemas");
            notaProblemas = sc.nextInt();

            System.out.println("Introduzca la nota de la parte teorica");
            notaTeorica = sc.nextInt();

            //Si alguna de las notas introducidas no se encuentran en el rango 0-10 lanzamos un mensaje de error
            if (notaPractica <= 0 || notaPractica > 10 ||
                    notaProblemas <= 0 || notaProblemas > 10 ||
                    notaTeorica <= 0 || notaTeorica > 10) {
                System.out.println("Error, las notas introducidas tienen que ser un numero entre 0 y 10");
                System.out.println();

            } else {    //Si introduce las notas correctas entoces

                //Calculamos la nota final
                notaFinal = (double) (notaPractica * 0.10) + (double) (notaProblemas * 0.5) + (double) (notaTeorica * 0.4);

                //Le añadimos 1 al contador anteriormente inicializado
                contador++;
                //Le sumamos a la variable sumatorio la nota final
                sumatorioNotas += notaFinal;

                //Imprimimos el resultado por pantalla
                System.out.println("La nota final del alumno es: " + notaFinal);
                System.out.println();

                //Todavía no nos salimos del bucle, pues seguimos calculando lo que vamos a mostrar luego en el menu

                //Calculamos la media de las notas dividiendo el sumatorio de las mismas entre el contador
                mediaNotas = sumatorioNotas / (double) contador;

                //Si la varaible notaFinal es mayor que notaMax
                if (notaFinal > notaMax) {
                    notaMax = notaFinal;    //Entonces la nota maxima es igual a la nota final
                }

                //Si la variable notaFinal es menor que notaMin
                if (notaFinal < notaMin) {
                    notaMin = notaFinal;    //Entonces la nota minima es igual a la nota final
                }
            }

        } while (true);

        //Declaramos una variable opcion donde vamos a guardar la respuesta del usuario
        int opc;

        //le mostramos el menu al usuario y le pedimos que elija una de las opciones
        System.out.println("Elija la opcion que desea realizar:");
        System.out.println("""
                [1] Saber la nota maxima
                [2] Saber la nota minma
                [3] Saber la media de todas las notas
                """);
        opc = sc.nextInt();

        //Con un switch mostramos las diferentes respuestas según la opcion elegida
        switch (opc) {
            case 1:
                System.out.println("La nota maxima es " + notaMax);
                break;
            case 2:
                System.out.println("La nota minima es " + notaMin);
                break;
            case 3:
                System.out.println("La media es " + mediaNotas);
                break;
            default:    //Si el usuario ha introducido una respuesta distinta a las ofrecidas en el menu lanzamos un mensaje de error
                System.out.println("Opcion no valida");
        }

        //Cerramos el scanner
        sc.close();
    }

}
