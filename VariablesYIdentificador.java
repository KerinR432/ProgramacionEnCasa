import java.util.Scanner;

public class VariablesYIdentificador {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //declaramos variables
        String nombre = "";
        String idIndentificador = "";
        int edad = 0;
        int grado = 0;
        char sección = ' ';
        System.out.println("Introduce tu nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Introduce tu identificador: ");
        idIndentificador = scanner.nextLine();
        System.out.println("Dime tu edad: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce tu grado: ");
        grado = Integer.parseInt(scanner.nextLine());
        System.out.println("Elige tu Sección: ");
        sección = scanner.nextLine().charAt(0);

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu identificador es: " + idIndentificador);
        System.out.println("Tu edadd es : " + edad);
        System.out.println("Tu grado es : " + grado);
        System.out.println("Y eres de :" + sección);

    }
}
