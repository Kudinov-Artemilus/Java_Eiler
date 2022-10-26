import java.util.Scanner;
public class Task01 {
    /*
Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9.
Сумма этих чисел равна 23.

    Найдите сумму всех чисел меньше (1000 - или вводит пользователь значение), кратных 3 или 5.
 */
    public static void main(String[] args) {
        int summa = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Найти сумму всех чисел меньше чем: ");
        int max = in.nextInt();

        for (int n = 1; n < max; n++ ) {
            if (n % 3 == 0 || n % 5 ==0) {
                summa +=n;
            }

        }
        System.out.println("Сумма всех чисел меньше " + max + ", кратных 3 или 5: " + summa);
    }
}