package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StreamMain streamMain = new StreamMain();
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        filterAndDisplay(bubbleSort(list.toArray(new Integer[0])));
        streamMain.makeStream();
        System.out.println("Конец работы программы");
    }

    public static Integer[] bubbleSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if ((array[j] < array[j - 1])) {
                    Integer temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public static void filterAndDisplay(Integer[] array) {
        System.out.println("--------------------------------");
        System.out.println("ПЕРВЫЙ СПОСОБ БЕЗ STREAM API");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
