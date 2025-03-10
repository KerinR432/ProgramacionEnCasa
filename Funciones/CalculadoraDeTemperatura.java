package Funciones;

import java.util.Scanner;

public class CalculadoraDeTemperatura {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        double tempC = 0,tempF = 0, tempK = 0;
        System.out.println("Introduce la Temperatura en grados Celsius...");
        tempC = Integer.parseInt(scanner.nextLine());
        mostrarMenu();
        opcion=Integer.parseInt(scanner.nextLine());
        do {
            switch (opcion){
                case 1:
                    tempF = gradosFahrenheit(tempC);
                    System.out.println("La temperatura "+tempC+"C"+" en grados Fahrenheit "+tempF);
                    break;
                case 2:
                    tempK = calcularGradosKelvin(tempC);
                    System.out.println("La temperatura "+tempC+"C"+" en grados Kelvin "+tempK);
                    break;
                case 3:
                default:
                    
            }
        }while (opcion==3);








    }

    public static double calcularGradosKelvin(double tempC) {
        double tempK;
        tempK = (tempC + 273.15);
        return tempK;
    }

    public static double gradosFahrenheit(double tempC) {
        double tempF;
        tempF = (tempC *1.8)+32;
        return tempF;

    }

    public static void mostrarMenu() {
        System.out.println("Hola bienvenido a la calculadora de Temperatura");
        System.out.println("1.- Calcular la temperatura en grados fahrenheit");
        System.out.println("2.- Calculalr la temperatura en Kelvin");
        System.out.println("3.,- Salir");
    }
}
