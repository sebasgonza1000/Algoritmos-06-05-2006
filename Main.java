import java.util.Scanner;

public class Main {

    // Método que saluda
    public static void saludar() {
        System.out.println("Hola, bienvenido al programa.");
    }

    // Método para pedir números
    public static int[] pedirNumeros() {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Ingresa el primer número: ");
        a = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        b = scanner.nextInt();

        return new int[]{a, b};
    }

    // Método que suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método principal
    public static void main(String[] args) {

        saludar();

        int[] numeros = pedirNumeros();

        int resultado = sumar(numeros[0], numeros[1]);

        System.out.println("La suma es: " + resultado);
    }
}