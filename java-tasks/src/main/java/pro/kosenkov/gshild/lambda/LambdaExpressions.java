package pro.kosenkov.gshild.lambda;

public class LambdaExpressions {

    public static void main(String[] args) {
        // Классика
        // stringCompare();

        String a = "Test 1 Test 2 Test 3";
        String b1 = "Test 2";
        String b2 = "Test 7";
        String b3 = "Test 7 Test 7 Test 7";
        StrCompare strCompare = (s1, s2) -> s1.indexOf(s2) != -1;

        if (strCompare.compare(a, b2)) {
            System.out.println("Найдено совпадение");
        } else {
            System.out.println("Cовпадение не найдено");
        }

        strCompare.testme();
        StrCompare.testStatic();

        System.out.println("---------------------------");

        strCompare = (s1, s2) -> s1.length() == s2.length();
        if (strCompare.compare(a, b3)) {
            System.out.println("Строки равны по длине");
        } else {
            System.out.println("Строки не равны по длине");
        }

    }

    public static void stringCompare() {
        String a = "Test 1 Test 2 Test 3";
        String b1 = "Test 2";
        String b2 = "Test 7";

        if (a.indexOf(b2) != -1) {
            System.out.println("Найдено совпадение");
        } else {
            System.out.println("Cовпадение не найдено");
        }
    }
}

@FunctionalInterface
interface StrCompare {
    boolean compare(String str1, String str2);

    default void testme() {
        System.out.println(123);
    }

    static void testStatic() {
        System.out.println(321);
    }
}




