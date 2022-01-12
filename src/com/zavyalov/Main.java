package com.zavyalov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("Результат без использования Collection API и Stream API:");
        List<Integer> positiveIntList = evenNumberFilter(positiveNumberFilter(intList));
        positiveIntList.sort(null);
        print(positiveIntList);

        StreamMain.streamMain(intList);
    }

    private static List<Integer> positiveNumberFilter(List<Integer> data) {
        List<Integer> result = new ArrayList<>();
        for (int num : data) {
            if (num > 0) {
                result.add(num);
            }
        }
        return result;
    }

    private static List<Integer> evenNumberFilter(List<Integer> data) {
        List<Integer> result = new ArrayList<>();
        for (int num : data) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    private static void print(List<Integer> data) {
        Iterator<Integer> result = data.iterator();
        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }
}
