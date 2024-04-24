package pro.kosenkov.filesystem;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class MyOut {
    public static void main(String[] args) throws IOException {
        /*var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");
        String[] stringArray1 = new String[strings.size()];
        stringArray1 = strings.toArray(stringArray1);
        Arrays.stream(stringArray1).forEach(System.out::println);*/

        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");
        // Object[] stringArray1 = strings.toArray(); // Так как нам нужен St

        String[] stringArray = Arrays.copyOf(strings.toArray(), strings.size(), String[].class);
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
