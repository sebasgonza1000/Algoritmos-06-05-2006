import java.util.Scanner;

public class Main {

    // Método que saluda
    public static void saludar() {
        System.out.println("Hola, bienvenido al programa.");
    }

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

    // Método principal que integra todos los métodos
    public static void main(String[] args) {
        saludar();

        int numero1 = pedirNumero("Digite el primer número entero positivo: ");
        int numero2 = pedirNumero("Digite el segundo número entero positivo: ");

        int resultado = sumar(numero1, numero2);

        System.out.println("La suma es: " + resultado);
    }
}
