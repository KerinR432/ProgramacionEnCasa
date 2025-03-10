package Funciones;

import java.util.Scanner;

public class GestionDeClases {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAM = 6;
        String[][] alumnos = new String[1][TAM];
        int opt = 0;


        do {
            System.out.println("Bienvenido a la Agenda Escolar ¿Que quieres hacer el dia de hoy?");
            System.out.println("1) Insertar Nuevo alumno");
            System.out.println("2) Modificar ficha de Alumno");
            System.out.println("3) Borrar ficha de Alumno");
            System.out.println("4) Buscar ficha de Alumno");
            System.out.println("5) Ordenar ficha de Alumno");
            System.out.println("6) Salir");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 1:
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("Nueva Ficha de Alumnoooo!");
                        for (int j = 0; j < TAM; j++) {
                        if (alumnos[i][j] == null) {
                            System.out.println("Introduce la fiche de alumno códigos, nombres, apellidos, \n" +
                                    "direcciones, teléfonos, correos");
                                alumnos[i][j] = sc.nextLine();
                            }

                        }
                    }
                    break;
                case 2:

                case 3:
                case 4:
                    System.out.println("Introduce el Nombre del alumno...");
                    String nombre = sc.nextLine();
                    for (int i = 0; i < alumnos.length; i++) {
                        for (int j = 0; j < TAM; j++) {
                            if (alumnos[i][j].equalsIgnoreCase(nombre)){
                                System.out.println(alumnos[j]);
                            }
                        }
                    }
                case 5:
                case 6:
                default:
                    System.out.println("Gracias por salir");
            }
        } while (opt != 6);
    }

}
