public class LasVariables {
    public static void main(String[] args) {
        //Creamos las Variables
        String nombre = "Ruvik";
        String apodo = "El famer";
        int numeros = 20;
        final int numero = 100;
        //Aqui Mostramos las variables
        System.out.println();
        System.out.println(nombre);
        System.out.println();
        System.out.println(numeros);
        System.out.println();
        System.out.println(numero);
        //cambiamos la variable
        numeros = 21;
        System.out.println(numeros);
        //combinar cadenas
        String miNickname = nombre + apodo;
        System.out.println(miNickname);
        //SUMAR NUMEROS
        System.out.println();
        int x = 5, y = 12;
        System.out.println(x + y);
        double prueba = 1.2d;
        System.out.println(prueba);
        System.out.println(nombre.concat(apodo));
    }
}
