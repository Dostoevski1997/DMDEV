package com.dmdev.lesson7.task;

/**
 * 4. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class task4 {

    public static void main(String[] args) {
        int [] values = {1, 2, 0, 6, 5, 7, 10, 3};

        System.out.println("maxIndex: " + findMax(values));
        System.out.println("minIndex: " + findMin(values));
        System.out.println(sumCalc(values));
    }


    public static int sumCalc (int[] values) {
        int maxIndex= findMax(values);
        int minIndex = findMin(values);
        if (minIndex>maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex=temp;
        }

        int result = 0;
        for (int i = minIndex+1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }

    public static int findMin (int [] values) {
        int min = values[0];
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if(min>values[i]) {
               min=values[i];
               minIndex=i;
            }

        }
        return minIndex;
    }

    public static int findMax (int [] values) {
        int max = values[0];
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if(max<values[i]) {
                max=values[i];
                maxIndex=i;
            }

        }
        return maxIndex;
    }


}
