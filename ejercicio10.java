public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(dimension);

        imprimirMatriz(matriz);
    }
}
