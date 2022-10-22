/**
 * Задача 2
 * Четные числа Фибоначчи
 *
 * Каждый следующий элемент ряда Фибоначчи получается
 * при сложении двух предыдущих.
 * Начиная с 1 и 2, первые 10 элементов будут:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * Найдите сумму всех четных элементов ряда Фибоначчи,
 * которые не превышают четыре миллиона.
 */
public class Task02 {
    public static void main(String[] args) {
        int  first  = 1;
        int  second = 2;
        int  next   = first + second;
        long summa = second;
        while (next <= 4_000_000) {
            if (next % 2 == 0) {
                summa += next;
            }
            first = second;
            second = next;
            next = first + second;
        }
        System.out.println("Сумма всех четных элементов ряда" +
                " Фибоначи, которые не превышают 4_000_000 равна: " + summa);

    }
}
