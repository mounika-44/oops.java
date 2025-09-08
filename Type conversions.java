public class TypeConversionCast {
    public static void main(String[] args) {
        int i = 100;
        double d = i;  // Implicit casting
        System.out.println("Int to Double: " + d);

        double x = 99.99;
        int y = (int) x;  // Explicit casting
        System.out.println("Double to Int: " + y);
    }
}
