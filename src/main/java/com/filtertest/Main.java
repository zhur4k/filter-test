package com.filtertest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] results = filter(new Integer[]{1, 2, 3, 4, 5}, o -> o - 1);
        System.out.println(
                Arrays.toString(results)
        );
    }

    private static <T> T[] filter(T[] objs, Filter<T> filter) {
        return Arrays.stream(objs)
                .map(filter::apply)
                .toArray(size -> Arrays.copyOf(objs, size));
    }
}