package pro.kosenkov.javarush.syntax.arrays.min;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Чтобы выполнить эту задачу, тебе нужно:
 * 1) Ввести с клавиатуры число N.
 * 2) Считать N целых чисел и заполнить ими массив.
 * 3) Найти минимальное число среди элементов массива и вывести в консоль.
 *
 * Требования:
 * •	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов и заполни числами с клавиатуры.
 * •	В методе main(String[]) выведи в консоль минимальное число среди элементов массива.
 * */
public class MinAndMaxArrElem {
    public static int[] array;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        array = IntStream.of(
                IntStream.range(0, n)
                        .map(i -> scanner.nextInt())
                        .toArray()
        ).toArray();

        Stream<Integer> arrBox = Arrays.stream(array).boxed();

        arrBox.min(Integer::compareTo).ifPresent(System.out::println);

        // Tasks0507 Max элемент
        // arrBox.max(Integer::compareTo).ifPresent(System.out::println);

        // Ренения ниже не соответствуют критериям проверки задач на JR
        // solution1(); // лучшее решение задачи
        // solution2();
        // solution3();
    }

    public static void solution1() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .min().ifPresent(System.out::println);
    }

    public static void solution2() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> integerList = IntStream.of(
                        IntStream.range(0, n)
                                .map(i -> scanner.nextInt())
                                .toArray()
                )
                .boxed()
                .collect(Collectors.toList()); // .toList()

        integerList.stream().min(Integer::compareTo).ifPresent(System.out::println);
    }

    public static void solution3() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = IntStream.of(
                IntStream.range(0, n)
                        .map(i -> scanner.nextInt())
                        .toArray()
        ).toArray();

        Stream<Integer> arrBox = Arrays.stream(arr).boxed();

        arrBox.min(Integer::compareTo).ifPresent(System.out::println);
    }
}
