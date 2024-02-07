public class ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = recibirNumeros();
        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
    }
    public static int[] recibirNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese números enteros (0 para terminar):");

        int capacidadInicial = 10;
        int[] numeros = new int[capacidadInicial];
        int contador = 0;

        while (true) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (contador == numeros.length) {
                numeros = aumentarCapacidad(numeros);
            }

            numeros[contador] = numero;
            contador++;
        }

        scanner.close();

        int[] resultado = new int[contador];
        System.arraycopy(numeros, 0, resultado, 0, contador);

        return resultado;
    }
}
