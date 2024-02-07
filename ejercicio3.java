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
    }
    }
}
