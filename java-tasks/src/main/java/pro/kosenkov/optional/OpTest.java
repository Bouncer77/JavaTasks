package pro.kosenkov.optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OpTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");
        String str = list.stream().findFirst().orElse("NPE"); // Привет
        System.out.println(str);
    }
}
