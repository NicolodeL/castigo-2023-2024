import java.util.Random;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(dimension);

        imprimirMatriz(matriz);
    }
    public static int[][] generarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = random.nextInt(100); // Generar número aleatorio entre 0 y 99
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio;
            }
        }

        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
