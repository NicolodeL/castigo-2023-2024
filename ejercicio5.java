public class ejercicio5 {
    public static void main(String[] args) {
        int N = 10;
        int[][] tables = generateMultiplicationTables(N);

        for (int i = 0; i < N; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + tables[i][j]);
            }
            System.out.println();
        }
    }
}
