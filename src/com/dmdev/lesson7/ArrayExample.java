package com.dmdev.lesson7;

public class ArrayExample {

    public static void main(String[] args) {
        int [] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = i+1;
            System.out.println(values[i]);
        }
    }

    private static void test() {
        int [] values = {1, 5, 6, 8, 9};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
