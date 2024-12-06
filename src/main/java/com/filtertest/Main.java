package com.filtertest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filter(new Integer[]{1, 2, 3, 4, 5}, o -> ((Integer) o) - 1)));
    }

    private static Object [] filter(Object [] objs, Filter filter) {
        return Arrays.stream(objs)
                .map(filter::apply)
                .toArray();
    }
}