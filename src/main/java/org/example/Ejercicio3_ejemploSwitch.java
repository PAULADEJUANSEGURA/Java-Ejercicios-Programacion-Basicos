// EJERCICIOS DE JAVA: AUTORA PAULA DE JUAN
// Paquete o FOLDER de la estructura de carpetas
package org.example;
// Importamos la Clase Scanner la API de Java - Librería 'java.util.Scanner'
import java.util.Scanner;
// Clase Publica Ejercicio 3
public class Ejercicio3_ejemploSwitch {
    public static void main(String[] args) {
        System.out.println("==== EJERCICIO 3 : DIAS DE LA SEMANA ========");
        System.out.println("Introduce un número entero del rango de 1 al 7 y te indicaremos el dia de la semana que corresponde: ");
        // Creamos el objeto Scanner 'sc' para que el usuario introduzca por teclado datos
        Scanner sc = new Scanner(System.in);
        // Declara la variable numeroDia como de tipo integer (entero)
        int numeroDia;
        // Guardo el valor que el usuario introduzca por teclado del objeto Scanner 'sc' y lo alojo en mi variable numeroDia de tipo int
        numeroDia = sc.nextInt();
        switch(numeroDia){
                case 1:
                    System.out.println("LUNES");
                    break;
                case 2:
                    System.out.println("MARTES");
                    break;
                case 3:
                    System.out.println("MIÉRCOLES");
                    break;
                case 4:
                    System.out.println("JUEVES");
                    break;
                case 5:
                    System.out.println("VIERNES");
                    break;
                case 6:
                    System.out.println("SÁBADO");
                    break;
                case 7:
                    System.out.println("DOMINGO");
                    break;
                default:
                    System.out.println("Día no válido");
                    break;
        }
    }
}