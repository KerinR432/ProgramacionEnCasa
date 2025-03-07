package Funciones;

import java.util.Scanner;

public class FuncionCuentaUnaHistoria {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre = "",apellido=" ",lugar=" ";

        System.out.println("Introduce un nombre...");
        nombre=scanner.nextLine();
        System.out.println("Introduce un apellido...");
        apellido=scanner.nextLine();
        System.out.println("Introduce un lugar...");
        lugar=scanner.nextLine();
        unaGranHistoria(nombre,apellido,lugar);
    }
    public static void unaGranHistoria(String nombre,String apellido,String lugar){
        System.out.println("Era hace una ves un gran cabellero/a que se llamaba "+nombre+" "+apellido+"\n" +
                "La historia de hoy viene esta ambientada en un mundo muy interseante "+lugar+"\n"+
                "y es que en este lugar habia un gran mal, pero nuestro gran caballero/a "+nombre+" combate con gran\n" +
                "valentia, es un buen ser, aunque no es muy poderoso es admirado por todo el reino, nuestro\n" +
                "hereo va a empezar su gran aventura, pero como el escritor de esta historia se ha quedo sin ideas \n" +
                "la historia continuara en otra ocación.");
    }
}
