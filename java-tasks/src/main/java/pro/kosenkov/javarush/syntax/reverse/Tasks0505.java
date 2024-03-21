package pro.kosenkov.javarush.syntax.reverse;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://javarush.com/quests/lectures/questsyntaxpro.level05.lecture02
 * Java Syntax Pro
 * 6 уровень, 3 лекция
 *
 * Тебе нужно написать программу, которая:
 *
 * 1) Считывает с консоли целое число N.
 * 2) Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
 * 3) Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
 *
 * Каждое число выводить с новой строки. Число N выводить не нужно.
 *
 * Требования:
 * •	Программа должна считывать число N и за ним еще N чисел.
 * •	В классе должен быть метод public static void main(String[]).
 * •	Нельзя добавлять новые методы в класс Solution.
 * •	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
 * •	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
 *
 * */
public class Tasks0505 {


    public static void main(String[] args) {

        // Вариант 1
        // Stream API - соответствует всем условиям задачи
        main1();

        // Вариант 2
        // Stream API - не соответствует всем условиям задачи (Нельзя добавлять новые методы в класс)
        // main2();

        // Вариант 3
        // Классический
        // main3();
    }

    // вариант 1
    public static void main1() {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 0) {
            System.exit(0);
        }

        List<Integer> arr = IntStream.of(
                        IntStream.range(0, n)
                                .map(i -> scanner.nextInt())
                                .toArray()
                )
                .boxed()
                .collect(Collectors.toList());

        if (n % 2 == 0) {
            Collections.reverse(arr);
        }

        arr.forEach(System.out::println);
    }

    // вариант 2 - не соответствует пункту - Нельзя добавлять новые методы в класс
    public static void main2() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 0) {
            System.exit(0);
        }

        Integer[] arr2 = IntStream.of(
                        IntStream.range(0, n)
                                .map(i -> scanner.nextInt())
                                .toArray()
                )
                .boxed()
                .toArray(Integer []::new);

        if (n % 2 == 0) {
            Arrays.stream(arr2)
                    .collect(reverse())
                    .forEach(System.out::println);
        } else {
            Arrays.stream(arr2)
                    .forEach(System.out::println);
        }
    }

    public static <T> Collector<T, ?, Stream<T>> reverse() {
        return Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list.stream();
        });
    }

    // вариант 3
    public static void main3() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }
    }
}
