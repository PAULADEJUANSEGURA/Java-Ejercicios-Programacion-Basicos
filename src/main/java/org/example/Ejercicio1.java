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
        Scanner sc = new Scanner(System.in);
        int edadUsuario;
        final int EDAD_MINIMA = 18;
        edadUsuario = sc.nextInt();
        // Pintamos en la consola la edad del usuario que ha introducido por teclado
        System.out.println("La edad introducida es: " + edadUsuario);
        if (edadUsuario >= EDAD_MINIMA){
            System.out.println("Tu edad indica que eres mayor de edad porque tienes igual o más de 18 años.");
        } else {
            System.out.println("Tu edad indica que eres menor de edad porque tienes menos de 18.");
        }
    }
}