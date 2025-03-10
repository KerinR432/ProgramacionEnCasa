package Funciones;

import java.util.Scanner;

public class CalculadoraMiCuenta {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int datoNum = 0, datoNum2 = 0, opcion = 0;

        do {
            menu();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Hola Bienvenido a la suma!!!");
                    System.out.println("Introduce los  numeros que deseas calcular");
                    System.out.println();
                    System.out.println("Introduce el primero numero...");
                    datoNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce un segundo numero...");
                    datoNum2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Gracias la suma de " + datoNum + " y de " + datoNum2 + " es: " + sumar(datoNum, datoNum2));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Hola Bienvenido a la resta!!!");
                    System.out.println("Introduce los  numeros que deseas calcular");
                    System.out.println();
                    System.out.println("Introduce el primero numero...");
                    datoNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce un segundo numero...");
                    datoNum2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Gracias la resta de " + datoNum + " y de " + datoNum2 + " es: " + resta(datoNum, datoNum2));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hola Bienvenido a la multiplicación!!!");
                    System.out.println("Introduce los  numeros que deseas calcular");
                    System.out.println();
                    System.out.println("Introduce el primero numero...");
                    datoNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce un segundo numero...");
                    datoNum2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Gracias la multipliación de " + datoNum + " y de " + datoNum2 + " es: " + multiplicar(datoNum, datoNum2));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Hola Bienvenido a la división!!!");
                    System.out.println("Introduce los  numeros que deseas calcular");
                    System.out.println();
                    System.out.println("Introduce el primero numero...");
                    datoNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce un segundo numero...");
                    datoNum2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Gracias la división de " + datoNum + " y de " + datoNum2 + " es: " + dividir(datoNum, datoNum2));
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Hola Bienvenido a sacar el Aumento!!!");
                    System.out.println("Introduce los  numeros que deseas calcular");
                    System.out.println();
                    System.out.println("Introduce el numero original...");
                    datoNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce el porcetaje que aumenta...");
                    datoNum2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Gracias el Aumento de " + datoNum + " y de " + datoNum2 + " es: " + aumento(datoNum, datoNum2));
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Hola Bienvenido a sacar el Descuento!!!");
                    System.out.println("Introduce los  numeros que deseas calcular");
                    System.out.println();
                    System.out.println("Introduce el numero original...");
                    datoNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("Introduce el porcetaje que descuentas...");
                    datoNum2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Gracias el Descuento de " + datoNum + " y de " + datoNum2 + " es: " + descuento(datoNum, datoNum2));
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Error, has introducido un numero que no era");
            }

        } while (opcion != 7);
    }

    public static void menu() {
        System.out.println("Hola Bienvenido a nuestra calculadora, tienes las siguienes opciones: ");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Mutiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Aumento");
        System.out.println("6.- Descuento");
        System.out.println("7.- Salir");
    }

    public static int sumar(int num1, int num2) {
        int resultado = 0;
        resultado = num1 + num2;
        return resultado;
    }

    public static int resta(int num1, int num2) {
        int resultado = 0;
        resultado = num1 - num2;
        return resultado;
    }

    public static int multiplicar(int num1, int num2) {
        int resultado = 0;
        resultado = num1 * num2;
        return resultado;
    }

    public static int dividir(int num1, int num2) {
        int resultado = 0;
        resultado = num1 / num2;
        return resultado;
    }

    public static int aumento(int num1, int num2) {
        int resultado = 0, temp = 0;
        temp = (num1 * num2) / 100;
        resultado = num1 + temp;
        return resultado;
    }

    public static int descuento(int num1, int num2) {
        int resultado = 0, temp = 0;
        temp = (num1 * num2) / 100;
        resultado = num1 - temp;
        return resultado;
    }
}
