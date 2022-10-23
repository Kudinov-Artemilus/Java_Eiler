/*
 Задача 3
     * Наибольший простой делитель
     *
     * Простые делители числа 13195 - это 5, 7, 13 и 29.
     *
     * Каков самый большой делитель числа 600851475143,
     * являющийся простым числом?
 */
public class Task03 {
    public static void main(String[] args) {
        long N = 600_851_475_143L;
        long maxPF = 0L;
        long delimeter = 2L;

        while (delimeter * delimeter <= N) {
            if (N % delimeter == 0) {
                maxPF = delimeter;
                N /= delimeter;
            }
            else {
                delimeter++;
            }
        }
       if (N > 1) {
          maxPF = N;
        }
        System.out.println("самый большой делитель числа 600851475143: "+ maxPF);


    }
}
