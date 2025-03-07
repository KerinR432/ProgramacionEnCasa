package Funciones;

import java.util.Scanner;

public class CalculadoraMiCuentaIA {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = obtenerOpcion();

            switch (opcion) {
                case 1:
                    realizarOperacion("suma", CalculadoraMiCuenta::sumar);
                    break;
                case 2:
                    realizarOperacion("resta", CalculadoraMiCuenta::resta);
                    break;
                case 3:
                    realizarOperacion("multiplicación", CalculadoraMiCuenta::multiplicar);
                    break;
                case 4:
                    realizarOperacion("división", CalculadoraMiCuenta::dividir);
                    break;
                case 5:
                    realizarAumento();
                    break;
                case 6:
                    realizarDescuento();
                    break;
                case 7:
                    System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Error: Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 7);
    }

    private static void mostrarMenu() {
        System.out.println("Hola, bienvenido a nuestra calculadora. Tienes las siguientes opciones:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Aumento");
        System.out.println("6. Descuento");
        System.out.println("7. Salir");
    }

    private static int obtenerOpcion() {
        System.out.print("Selecciona una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void realizarOperacion(String operacion, Operacion calculo) {
        System.out.println("Hola, bienvenido a la " + operacion + "!");
        System.out.println("Introduce los números que deseas calcular:");

        int num1 = obtenerNumero("Introduce el primer número: ");
        int num2 = obtenerNumero("Introduce el segundo número: ");

        int resultado = calculo.calcular(num1, num2);
        System.out.printf("Gracias, la %s de %d y %d es: %d%n%n", operacion, num1, num2, resultado);
    }

    private static void realizarAumento() {
        System.out.println("Hola, bienvenido a calcular el aumento!");
        int num = obtenerNumero("Introduce el número original: ");
        int porcentaje = obtenerNumero("Introduce el porcentaje que aumenta: ");

        int resultado = aumento(num, porcentaje);
        System.out.printf("Gracias, el aumento de %d es: %d%n%n", num, resultado);
    }

    private static void realizarDescuento() {
        System.out.println("Hola, bienvenido a calcular el descuento!");
        int num = obtenerNumero("Introduce el número original: ");
        int porcentaje = obtenerNumero("Introduce el porcentaje que descuentas: ");

        int resultado = descuento(num, porcentaje);
        System.out.printf("Gracias, el descuento de %d es: %d%n%n", num, resultado);
    }

    private static int obtenerNumero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine());
    }

    private static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    private static int resta(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    private static int dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0; // O manejar de otra manera
        }
        return num1 / num2;
    }

    private static int aumento(int num, int porcentaje) {
        return num + (num * porcentaje / 100);
    }

    private static int descuento(int num, int porcentaje) {
        return num - (num * porcentaje / 100);
    }

    @FunctionalInterface
    interface Operacion {
        int calcular(int num1, int num2);
    }
}

