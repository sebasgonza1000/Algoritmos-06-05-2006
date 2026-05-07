import java.util.Scanner;

public class Main {

    // Método que pide un número
    public static int pedirNumero(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = entrada.nextInt();
        return numero;
    }

    // Método que suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

}
