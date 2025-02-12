import java.util.Scanner;

/***
 * Un centro educativo nos ha pedido que diseñemos una aplicación para calcular algunos datos
 * estadísticos de las edades de los alumnos. Se introducirán datos hasta que uno de ellas sea
 * negativo. La aplicación mostrará la suma de todas las edades, la media, de cúantos alumnos
 * hemos introducido las edades y cuántos alumnos son mayores de edad.Implementar la aplicación requerida
 */
public class Bucles3Punto2 {
    static Scanner scanner = new Scanner(System.in);//Inicializamos el Scanner de manera global

    public static void main(String[] args) {
        //inializamos variables
        int edades = 0, contEdades = 0, sumaEdades = 0, contEdadesMayor = 0;
        double media = 0;
        //pedimos edades
        System.out.println("Introudce la edad de los Alumnos...");
        edades = scanner.nextInt();
        //creamos el bucle
        mediaSumaYMayorDeEdades(edades, contEdades, sumaEdades, contEdadesMayor, media);
    }

    public static void mediaSumaYMayorDeEdades(int edades, int contEdades, int sumaEdades, int contEdadesMayor, double media) {
        while (edades > 0) {
            contEdades++;
            sumaEdades += edades;
            if (edades >= 18) {
                contEdadesMayor++;
            }
            media = (double) sumaEdades / contEdades;
            System.out.println("Introudce la edad de los Alumnos...");
            edades = scanner.nextInt();

        }
        System.out.println("La cantidad de edades son: " + contEdades + " tambien la media de las edades es: " +
                media + " y la cantidad que son mayores son: " + contEdadesMayor + " y por ultimo la suma de " +
                "  todas las edades son: " + sumaEdades);
    }
}
