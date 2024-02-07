public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int[] factoresPrimos = obtenerFactoresPrimos(numero);
        System.out.print(numero + " = ");
        for (int i = 0; i < factoresPrimos.length; i++) {
            System.out.print(factoresPrimos[i]);
            if (i < factoresPrimos.length - 1) {
                System.out.print(" * ");
            }
        }
    }
    
}
