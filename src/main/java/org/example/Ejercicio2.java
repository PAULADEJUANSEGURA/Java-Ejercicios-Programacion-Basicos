// EJERCICIOS DE JAVA: AUTORA PAULA DE JUAN
// Paquete o FOLDER de la estructura de carpetas
package org.example;
// Importamos la Clase Scanner la API de Java - Librería 'java.util.Scanner'
import java.util.Scanner;
// Clase Publica del EJERCICIO 2
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("==== EJERCICIO 2 : NUMERO PAR O IMPAR =====");
        // Enviamos mensaje por consola para el usuario:
        System.out.println("Introduce un número entero para saber si es par o impar: ");
        // Creamos el objeto Scanner 'sc' para que el usuario introduzca por teclado datos
        Scanner sc = new Scanner(System.in);
        // Declara la variable numeroUsuario como de tipo integer (entero)
        int numeroUsuario;
        // Guardo el valor que el usuario introduzca por teclado del objeto Scanner 'sc' y lo alojo en mi variable numeroUsuario de tipo int
        numeroUsuario = sc.nextInt();
        /* Creamos un condicional if / else para ver si el numero es divisible entre 2 y de resto da 0, entonces sería un numero PAR;
        y si el número al dividirlo entre 2 de resto NO da cero, entonces es que no es divisible entre 2 y por tanto es un numero IMPAR
        Por tanto en la condición del if vamos a usar el Operador del Módulo que es el símbolo '%' */
        if(numeroUsuario % 2 == 0){
            /* Imprimimos por consola el mensaje cuando la condición se cumple y por tanto el numero es PAR
            porque el resto de la división entre 2 es estrictamente igual a cero.
            Lo indicamos en la condición del if con el operador del Módulo o Residuo de la División '%'
            Cualquier numero dividido entre 2 que de resto da CERO es un numero PAR. */
            System.out.println("Tu numero es: " + numeroUsuario + ". -> Y por tanto es divisible entre 2 y de resto da 0 y es un número PAR.");
        }else{
            /* Cualquier otro resto diferente de CERO al dividir el numeroUsuario entre 2, indicará que no es PAR.
            Por ejemplo: si el numero es 5 / 2 = 2 y de resto 1. 5 es un número IMPAR.
            -> Recordamos que estamos hablando de un programa hecho con numero ENTEROS o INTEGERS (int)
            por tanto no se valoran decimales o punto flotante.
            */
            System.out.println("Tu numero es: " + numeroUsuario + ". -> Y al dividirlo entre 2 NO NOS DA CERO! Esto indica que el numero es IMPAR.");
        }
    }
}
