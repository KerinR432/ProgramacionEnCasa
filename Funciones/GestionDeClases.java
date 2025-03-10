package Funciones;

import java.util.Scanner;

public class GestionDeClases {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int TAM = 6;
        String[][] alumnos = new String[2][TAM];
        int opt = 0;


        do {
            menu();
            opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 1:
                    introducirAlumnos(alumnos, TAM);
                    break;
                case 2:
                    modificarAlumno(alumnos, TAM);
                    break;

                case 3:
                    borrarAlumno(alumnos, TAM);
                    break;
                case 4:
                    if (buscarAlumnos(alumnos, TAM)) {
                        System.out.println();
                        for (int i = 0; i < 1; i++) {
                            for (int j = 0; j < TAM; j++) {
                                System.out.println(alumnos[i][j] + " ");

                            }
                            System.out.println();
                        }

                    }
                    break;
                case 5:
                case 6:
                    System.out.println("Gracias por salir");
                default:
                    System.out.println("Error has introducido una que no existe, vuelve introducir");
            }
        } while (opt != 6);
    }

    public static void modificarAlumno(String[][] alumnos, int TAM) {
        if (buscarAlumnos(alumnos, TAM)) {
            for (int i = 0; i < alumnos.length; i++) {
                for (int j = 0; j < TAM; j++) {
                    System.out.println("Introduce la fiche de alumno nombres, apellidos, \n" +
                            "direcciones, teléfonos, correos");
                    alumnos[i][j] = sc.nextLine();
                }
            }
        }
    }

    public static void borrarAlumno(String[][] alumnos, int TAM) {
        if (buscarAlumnos(alumnos, TAM)) {
            for (int i = 0; i < alumnos.length; i++) {
                for (int j = 0; j < TAM; j++) {
                    alumnos[i][j] = " ";
                }
            }
        }
    }

    public static boolean buscarAlumnos(String[][] alumnos, int TAM) {
        System.out.println("Introduce el Nombre del alumno...");
        String nombre = sc.nextLine();
        for (int i = 0; i < alumnos.length; i++) {
            if (!alumnos[i].equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static void introducirAlumnos(String[][] alumnos, int TAM) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nueva Ficha de Alumnoooo!");
            System.out.println("Introduce el codigo");
            alumnos[i][i] = sc.nextLine();
            for (int j = 0; j < TAM; j++) {
                if (alumnos[i][j] == null) {
                    System.out.println("Introduce la fiche de alumno nombres, apellidos, \n" +
                            "direcciones, teléfonos, correos");
                    alumnos[i][j] = sc.nextLine();
                }

            }
        }
    }

    public static void menu() {
        System.out.println("Bienvenido a la Agenda Escolar ¿Que quieres hacer el dia de hoy?");
        System.out.println("1) Insertar Nuevo alumno");
        System.out.println("2) Modificar ficha de Alumno");
        System.out.println("3) Borrar ficha de Alumno");
        System.out.println("4) Buscar ficha de Alumno");
        System.out.println("5) Ordenar ficha de Alumno");
        System.out.println("6) Salir");
    }

}
