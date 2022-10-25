
/**
 * Задача 5
 * Наименьшее кратное
 *
 * 2520 - самое маленькое число,
 * которое делится без остатка
 * на все числа от 1 до 10.
 *
 * Какое самое маленькое число
 * делится нацело на все числа
 * от 1 до 20? */

public class Task05 {
    public static void main (String[] args) {
        int currentNumber = 20;
        int limited = 20;


        while (!isDelimited(currentNumber, limited) ) {
            currentNumber++;
        }
        System.out.println("самое маленькое число " +
                " делится нацело на все числа " +
                " от 1 до 20:  " + currentNumber);
    }



    public static boolean isDelimited(int number, int maxDelimited) {
        for (int n = 2; n <= maxDelimited; n++) {
            if (number % n != 0) {
                return false;
            }
        }
        return true;
    }



}
