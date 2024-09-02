package Lesson6;

/**
 * 4. Написать программу, опредделяющее, является ли число простым,
 * т.е, делится без остатка только на 1 и на само себя
 */
public class task4 {
    public static void main(String[] args) {
        int value = 3;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    public static boolean isSimple (int value) {
        boolean result = true;
        for (int i = 2; i <value; i ++) {
            if (value % i ==0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
