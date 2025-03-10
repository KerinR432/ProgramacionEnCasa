package Funciones;

import java.util.Scanner;

public class FuncionCuentaUnaHistoriaIA {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerEntrada("Introduce un nombre...");
        String apellido = obtenerEntrada("Introduce un apellido...");
        String lugar = obtenerEntrada("Introduce un lugar...");

        contarHistoria(nombre, apellido, lugar);
    }

    private static String obtenerEntrada(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    private static void contarHistoria(String nombre, String apellido, String lugar) {
        String historia = String.format(
                "Era hace una vez un gran caballero/a que se llamaba %s %s.\n" +
                        "La historia de hoy está ambientada en un mundo muy interesante: %s.\n" +
                        "En este lugar había un gran mal, pero nuestro gran caballero/a %s combate con gran valentía.\n" +
                        "Es un buen ser, aunque no es muy poderoso, es admirado por todo el reino.\n" +
                        "Nuestro héroe va a empezar su gran aventura, pero como el escritor de esta historia se ha quedado sin ideas,\n" +
                        "la historia continuará en otra ocasión.",
                nombre, apellido, lugar, nombre
        );

        System.out.println(historia);
    }
}
