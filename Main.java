public static int pedirNumero(String mensaje) {
    Scanner entrada = new Scanner(System.in);
    System.out.print(mensaje);
    int numero = entrada.nextInt();
    return numero;
}
