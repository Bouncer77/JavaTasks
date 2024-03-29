package pro.kosenkov.testme;

public class Infinity {

    public static void main(String[] args) {
        System.out.println( 100.0 / 0.0 ); // Infinity
        System.out.println( -100.0 / 0.0 ); // -Infinity
        System.out.println(0.0 / 0.0); // NaN
        double infinity = 1d / 0d;
        System.out.println(infinity / infinity); // NaN
    }
}
