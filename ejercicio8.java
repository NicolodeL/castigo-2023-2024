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
}
