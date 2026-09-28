// EJERCICIOS DE JAVA: AUTORA PAULA DE JUAN
// Paquete o FOLDER de la estructura de carpetas
package org.example;
// Importamos la Clase Scanner la API de Java - Librería 'java.util.Scanner'
import java.util.Scanner;
// Clase Publica del EJERCICIO 1
public class Ejercicio1 {
    // Método MAIN
    public static void main(String[] args) {
        System.out.println("==== EJERCICIO 1 : PROGRAMA SOBRE LA EDAD =====");
        // Enviamos mensaje por consola para el usuario:
        System.out.println("Introduce tu edad: ");
        // Creamos el objeto de la Clase Scanner
        Scanner sc = new Scanner(System.in);
        // Declaramos una variable integer para luego alojar el dato de la edad del Usuario
        int edadUsuario;
        // Declaramos una constante con la palabra reservada 'final' de tipo integer con el valor 18
        final int EDAD_MINIMA = 18;
        // Alojamos el valor que el usuario ha introducio por teclado en el objeto Scanner sc dentro de la variable edadUsuario
        edadUsuario = sc.nextInt();
        // Pintamos en la consola la edad del usuario que ha introducido por teclado
        System.out.println("La edad introducida es: " + edadUsuario);
        // Creamos un condicional con if / else en el cual la condición es que edadUsuario tiene que ser mayor o igual que la constante con valor de 18
        if (edadUsuario >= EDAD_MINIMA){
            // Si edadUsuario es mayor o igual a 18 entonces imprimirá en la consola el siguiente String
            System.out.println("Tu edad indica que eres mayor de edad porque tienes igual o más de 18 años.");
        } else {
            // Si edadUsuario no fuera mayor o igual a 18, entonces es que es menor que 18 y por tanto imprimimos que la edad es menor de 18 años
            System.out.println("Tu edad indica que eres menor de edad porque tienes menos de 18 años.");
        }
    }
}