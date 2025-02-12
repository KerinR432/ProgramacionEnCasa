import java.util.Scanner;

/***
 * Diseñar un programa que muestre, para cada número introducido por teclado, si es par,si es positivo
 * y su cuadrado. El proceso se repitirá hasta que el número introducido por teclado sea 0.
 */
public class Bucles3Punto1 {
    static Scanner scanner = new Scanner(System.in);//Creamos un Scanner global

    public static void main(String[] args) {
        //Inicializamos la variable
        int numero = 0;
        //pedir por teclado un numero
        System.out.println("Introduce tu numero...");
        numero = scanner.nextInt();
        sacarParPositivoYCuadrado(numero);

    }

    public static void sacarParPositivoYCuadrado(int numero) {
        //creamos un bucle
        while (numero != 0) {//el bucle seguira hasta que el numero no sea 0
            if (numero % 2 == 0) {//sascamos el residuo que de dividir el numero / 2

                System.out.println(numero + " Es un numero par");//mostramos por pantalla
            }
            if (numero > 0) {//aqui una condicion si el numero es positivo
                System.out.println(numero + " Es positivo");//mostramos el numero
            }
            //mostramos el doble de u numero
            System.out.println("El cuadrado de " + numero + " es " + (numero * numero));
            System.out.println("Introduce tu numero...");
            numero = scanner.nextInt();
        }
    }
}
