public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión de los vectores: ");
        int dimension = scanner.nextInt();

        int[] vector1 = leerVector(dimension);
        int[] vector2 = leerVector(dimension);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los vectores es: " + productoEscalar);
    }

}
