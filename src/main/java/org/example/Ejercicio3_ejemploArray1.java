// EJERCICIOS DE JAVA: AUTORA PAULA DE JUAN
// Paquete o FOLDER de la estructura de carpetas
package org.example;
// Importamos la Clase Scanner la API de Java - Librería 'java.util.Scanner'
import java.util.Scanner;
// Clase Publica Ejercicio 3
public class Ejercicio3_ejemploArray1 {
    public static void main(String[] args) {
        System.out.println("==== EJERCICIO 3 : DIAS DE LA SEMANA ========");
        System.out.println("Introduce un número entero del rango de 1 al 7 y te indicaremos el dia de la semana que corresponde: ");
        // Creamos el objeto Scanner 'sc' para que el usuario introduzca por teclado datos
        Scanner sc = new Scanner(System.in);
        // Declara la variable numeroUsuario como de tipo integer (entero)
        int numeroUsuario;
        // Guardo el valor que el usuario introduzca por teclado del objeto Scanner 'sc' y lo alojo en mi variable numeroUsuario de tipo int
        numeroUsuario = sc.nextInt();
        String[] dias = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sábado";
        dias[6] = "Domingo";
        if(numeroUsuario >= 1 && numeroUsuario <= 7){
            System.out.println("El dia de la semana es: " + dias[numeroUsuario - 1]);
        }else {
            System.out.println("Tu número está fuera del rango del 1 al 7.");
        }
    }
}
