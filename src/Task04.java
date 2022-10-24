public class Task04 {
    /**
     * Задача 4
     * Наибольшее произведение-палиндром
     *
     * Число-палиндром с обеих сторон
     * (справа налево и слева направо) читается одинаково.
     * Самое большое число-палиндром,
     * полученное умножением
     * двух двузначных чисел – 9009 = 91 × 99.
     *
     * Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
     */
    public static void main (String[] args) {
        int maxPalindrom = 0;

        int iMax = 0;
        int jMax = 0;
        int multiply;


        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                multiply = i * j;
                if (isPalindrome(multiply)) {
                    maxPalindrom = multiply;
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println("амый большой палиндром, полученный умножением двух трехзначных чисел: " + maxPalindrom);
        System.out.println("1 число: " + iMax);
        System.out.println("2 число: " + jMax);
    }
    public static boolean isPalindrome(int number) {
        String strNumber = String.valueOf(number);
        String strNumberReverse = new StringBuilder(strNumber).reverse().toString();
        return strNumber.equals(strNumberReverse);

    }
}
