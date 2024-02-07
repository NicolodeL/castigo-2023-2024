public class ejercicio2 {
    public static void main(String[] args) {
        mayor();
    }
    public static void mayor() {
        char mayorChar = (char) (Math.pow(2, 16) - 1);
        short mayorShort = (short) (Math.pow(2, 15) - 1);
        int mayorInt = (int) (Math.pow(2, 31) - 1);

        System.out.println("El mayor número entero representable en un char es: " + (int) mayorChar);
        System.out.println("El mayor número entero representable en un short es: " + mayorShort);
        System.out.println("El mayor número entero representable en un int es: " + mayorInt);

}
}
