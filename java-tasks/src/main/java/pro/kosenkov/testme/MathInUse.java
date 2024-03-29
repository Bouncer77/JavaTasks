package pro.kosenkov.testme;

import java.util.Random;

public class MathInUse {

    public static void main(String[] args) {

        /*constants();
        trigonometricFunctions(Math.toRadians(60));
        algebraicFunctions(3, 2);
        minAndMax(3, 23, 100);*/
        // randomMe(10); // double Math.random() [0, 1)
        // randomClassInUse();
        gaussianTest(10_000_000);
    }

    public static void gaussianTest(int n) {
        Random random = new Random();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextGaussian();
        }

        double min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    public static void randomClassInUse() {
        Random random = new Random();
        double d = random.nextDouble(); // равносильно Math.random()
        float f = random.nextFloat();
        int max = 100;
        int num = random.nextInt(max); // [0, max)
        int randomInt = random.nextInt(); // [-2147483648 до +2147483647]
        long randomLong = random.nextLong(); // значение будет из всего возможного диапазона значений типа long
        boolean randomBool = random.nextBoolean();
        byte[] bytes = new byte[200];
        random.nextBytes(bytes); // заполняет переданный в него массив случайными значениями

        double g = random.nextGaussian(); // возвращает бесконечный диапозон
        // Пик значений в нашем случае придется на 0.5,
    }


    public static void randomMe(int n) {

        // Генерирует n псевдослучайных чисел
        for (int i = 0; i < n; i++) {
            System.out.print(Math.random() + ", ");
        }
        System.out.println();

        // от [1, 7) округленные, т.е целые числа в диапозоне [1, 6]
        for (int i = 0; i < n; i++) {
            System.out.print((int)(Math.random() * 6 + 1) + ", ");
        }
    }

    private static void minAndMax(double x, double y, double z) {
        System.out.format("Math.min(x-5+y*20, x*x+y*y) = %f\n", Math.min(x-5+y*20, x*x+y*y));
        System.out.format("Math.max(x-5+y*20, x*x+y*y) = %f\n", Math.max(x-5+y*20, x*x+y*y));

        // Вот как можно записать минимум из 3-х чисел:
        System.out.format("Math.min(%f, Math.min(%f, %f)) = %f\n", x, y, z, Math.min(x, Math.min(y, z)));
    }

    public static void constants() {
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E = " + Math.E);
    }


    public static void algebraicFunctions(double x, int n) {
        System.out.format("sqrt(%f) = %f\n", x, Math.sqrt(x)); // квадратный корень из x
        System.out.format("cbrt(%f) = %f\n", x, Math.cbrt(x)); // кубический корень из x
        System.out.format("pow(%f) = %f\n", x, Math.pow(x, n)); // возведение в степень: x^n

        System.out.format("exp(%f) = %f\n", x, Math.exp(x)); // экспонента: e^x
        System.out.format("log(%f) = %f\n", x, Math.log(x)); // натуральный логарифм a: ln(a)

        /*
         * При сложении очень маленьких и очень больших double переменных часто может возникнуть ситуация,
         * когда очень маленькое значение просто игнорируется (отбрасывается) как незначащее.
         * Это, собственно, и будет происходить, если использовать функции log() и exp().
         * Поэтому программисты придумали функции, которые возвращают только ту самую «маленькую значащую часть»
         * */
        System.out.format("log1p(%f) = %f\n", x, Math.log1p(x)); // натуральный логарифм x + 1: ln(x + 1)
        System.out.format("expm1(%f) = %f\n", x, Math.expm1(x)); // e^x - 1

        // Кубический корень или корень более высокой степени
        System.out.format("the root of the fourth degree of %f = %f\n", x, Math.pow(x, 0.25)); // корень четвертой степени из х

        // Если вам нужен логарифм числа b по основанию a, воспользуйтесь простой формулой: log_a_(b) = ln(b) / ln(a)
    }

    // принимают угол, заданный в радианах.
    public static void trigonometricFunctions(double angleRad) {

        // double toRadians(double angdeg) - Преобразует угол из градусов в радианы
        // toDegrees(double angrad) - из радиан в градусы


        // Возвращает синус угла d, заданного в радианах
        // double sin(double d)
        System.out.format("Math.sin(%f) = %f\n", angleRad, Math.sin(angleRad)); // синус
        System.out.format("Math.cos(%f) = %f\n", angleRad, Math.cos(angleRad)); // косинус
        System.out.format("Math.tan(%f) = %f\n", angleRad, Math.tan(angleRad)); // тангенс

        // Возвращает арксинус
        // double asin(double d)
        System.out.format("Math.asin(%f) = %f\n", angleRad, Math.asin(60)); // арксинус
        System.out.format("Math.acos(%f) = %f\n", angleRad, Math.acos(60)); // арккосинус
        System.out.format("Math.atan(%f) = %f\n", angleRad, Math.atan(60)); // арктангенс

        // гиперболическая геометрия
        // Возвращает гиперболический синус
        // double sinh(double d)
        System.out.format("Math.sinh(%f) = %f\n", angleRad, Math.sinh(60)); // гиперболический синус
        System.out.format("Math.cosh(%f) = %f\n", angleRad, Math.cosh(60)); // гиперболический косинус
        System.out.format("Math.tanh(%f) = %f\n", angleRad, Math.tanh(60)); // гиперболический тангенс
    }
}
