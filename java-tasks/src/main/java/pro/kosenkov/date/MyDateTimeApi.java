package pro.kosenkov.date;

import java.time.Instant;

public class MyDateTimeApi {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Instant.MAX.getEpochSecond());
        System.out.println();
        System.out.println(getMaxFromMilliseconds().getEpochSecond());

    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }
    static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }
}
