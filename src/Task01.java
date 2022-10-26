import java.util.Scanner;
public class Task01 {
    /*
Если выписать все натуральные числа меньше 10, кратные 3 или 5,
то получим 3, 5, 6 и 9.
Сумма этих чисел равна 23.

    Найдите сумму всех чисел меньше (1000 - или вводит пользователь значение), кратных 3 (num1) или 5 (num2).
    Сумма всех чисел меньше 1000, кратных 3 или 5 233168

 */
    public static void main(String[] args) {
        int summa = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Найти сумму всех чисел меньше чем: ");
        int max = in.nextInt();
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        for (int n = 1; n < max; n++ ) {
            if (n % num1 == 0 || n % num2 ==0) {
                summa +=n;
            }

        }
        System.out.println("Сумма всех чисел меньше " + max + ", кратных " + num1 + " или " + num2 + ": " + summa);
    }
}