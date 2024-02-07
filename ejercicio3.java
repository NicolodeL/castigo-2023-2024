public class ejercicio3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);
        int sumaMultiplosDe5 = sumarValoresArray(multiplosDe5);

        System.out.println("Los múltiplos de 5 comprendidos entre " + begin + " y " + end + " son:");
        for (int multiplo : multiplosDe5) {
            System.out.println(multiplo);
        }

        System.out.println("La suma de los múltiplos de 5 es: " + sumaMultiplosDe5);
        System.out.println("La cantidad de múltiplos de 5 es: " + multiplosDe5.length);
    }public static int[] obtenerMultiplosDe5(int begin, int end) {
        int cantidadMultiplos = (end - begin) / 5 + 1;
        int[] multiplos = new int[cantidadMultiplos];

        for (int i = 0; i < cantidadMultiplos; i++) {
            multiplos[i] = begin + i * 5;
        }

        return multiplos;
    }

    public static int sumarValoresArray(int[] array) {
        int suma = 0;

        for (int valor : array) {
            suma += valor;
        }

        return suma;   
    }
}
