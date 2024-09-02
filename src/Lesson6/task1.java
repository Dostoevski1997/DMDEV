package Lesson6;


/**
 * 1. Написать программу высчитывающаю факториал введенного целого числа
 */
public class task1 {
    public static void main(String[] args) {
        int value = 3;
        int result = factorial(value);
        System.out.println(result);

        int result2 = factorialWhile(value);
        System.out.println(result);

    }

    public static int factorialWhile (int value){
        int result = 1;
        int i = 1;
        while (i<=value) {
            result *=i;
            i++;
        }
        return result;
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i=1; i<=value; i++) {
            result*=i;
        }
        return result;
    }
}
