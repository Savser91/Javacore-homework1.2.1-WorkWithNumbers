package com.company;

import java.util.*;

public class StreamMain {
    public StreamMain() {}
    private List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    public void makeStream() {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("ВТОРОЙ СПОСОБ СО STREAM API");
        list.stream().filter(x -> x > 0 && x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("--------------------------------");
    }
}
