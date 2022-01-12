package com.zavyalov;

import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void streamMain(List<Integer> list) {
        System.out.println("\nРезультат с использованием стримов из библиотеки Stream API:");
        list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
