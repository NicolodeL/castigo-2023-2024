import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public static int[] obtenerFactoresPrimos(int numero) {
        List<Integer> factoresPrimos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }

        int[] resultado = new int[factoresPrimos.size()];
        for (int i = 0; i < factoresPrimos.size(); i++) {
            resultado[i] = factoresPrimos.get(i);
        }

        return resultado;
    }
}
