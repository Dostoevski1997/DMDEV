package com.dmdev.lesson7.task;

/**
 * 1. Написать программу которая печатает массив сначала в обычном порядке затем в обратном
 * */
public class task1 {
    public static void main(String[] args) {
        int [] values = {1, 6, 9, 12, 15};
        printArray(values);
        printArrayForEach(values);
        pringArrayReverse(values);
    }

    public static void pringArrayReverse (int[] values) {
        for (int i = values.length - 1; i>=0; i--) {
            System.out.print(values[i]+ " ");
        }
        System.out.println();
    }

    public static void printArray (int[] values) {
        for (int i=0; i<values.length; i++) {
            System.out.print(values[i]+ " ");
        }
        System.out.println();
    }

    public static void printArrayForEach (int[] values) {
        for (int value : values) {
            System.out.print(value+ " ");
        }
        System.out.println();
    }


}
