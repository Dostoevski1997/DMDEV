package Lesson6;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа
 */

public class task2 {
    public static void main(String[] args) {
        int value = 0;
        int result = sum(value);
        System.out.println(result);

        int result2 = sum2(value);
        System.out.println(result2);
    }

    public static int sum2 (int value) {
        int result = 0;
        for (int currentValue = value; currentValue !=0; currentValue /=10) {
            result += currentValue % 10;
        }
        return result;
    }

    public static int sum (int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue !=0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

}
