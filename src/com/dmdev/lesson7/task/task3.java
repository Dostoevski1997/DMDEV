package com.dmdev.lesson7.task;

/**
 * 3. написать метод equals, который определяет, равны ли между собой соответствующие элементы
 * 2-х двумерных массивов.
 */
public class task3 {
    public static void main(String[] args) {
    int[][] values1 = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2}
    };
        int[][] values2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2}
        };

        boolean result = equal(values1, values2);
        System.out.println(result);
    }

    public static boolean equal (int [][] values1, int [][]values2) {
        if(values1.length != values2.length) {
            return false;
        }
        for (int i = 0; i < values1.length; i++) {
            int [] row1 = values1[i];
            int [] row2 = values2[i];
            if (row1.length != row2.length) {
                return false;
            }
            for (int j = 0; j < row1.length; j++) {
                if (row1[j] != row2[j]) {
                    return false;
                }
            }

        }
        return true;
    }
}
