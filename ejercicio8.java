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
    public static double calcularMedia(int[] numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.length;
    }
    public static int calcularMinimo(int[] numeros) {
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        return minimo;
    }
    public static int calcularMaximo(int[] numeros) {
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }
}
