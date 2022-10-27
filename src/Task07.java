/**
 * Задача 7
 * 10001-ое простое число
 *
 * Выписав первые шесть простых чисел,
 * получим 2, 3, 5, 7, 11 и 13.
 * Очевидно, что 6-ое простое число - 13.
 *
 * Какое число является 10001-ым простым числом?
 */
public class Task07 {
    public static void main(String[] args) {
        int count = 2;
        int finish = 10_001;

        int simpleCount = 0;
        int simpleNumber = count;

        while (simpleCount != finish) {
            if (isSimple(count)) {
                simpleNumber = count;
                simpleCount++;
            }
            count++;
        }
        System.out.println("число является 10001-ым простым числом: " + simpleNumber);
    }
    public static boolean isSimple (int number) {
        for (int n = 2; n < number; n++) {
            if (number % n == 0) {
                return false;
            }

        }
        return true;
    }
}
