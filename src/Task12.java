/*
Последовательность треугольных чисел образуется путем сложения натуральных чисел. К примеру,
7-ое треугольное число будет 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. Первые десять треугольных чисел:
1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
Перечислим делители первых семи треугольных чисел:
  1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
Как мы видим, 28 - первое треугольное число, у которого более пяти делителей.
Каково первое треугольное число, у которого более пятисот делителей?
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Task12 {

    public static int getDivisors(int number){
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(number % 2 == 0){
            list.add(2);
            number /= 2;
        }
        for(int i = 3; i <= Math.sqrt(number); i++){
            while(number % i==0){
                list.add(i);
                number /= i;
            }
        }

        if(number > 2){
            list.add(number);
        }

        return findDivisors(list);
    }
    public static int findDivisors(ArrayList<Integer> list){
        int result = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : list){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);

        }
        for(int i : map.keySet()){
            result = result * (map.get(i) + 1);
        }

        return result;
    }
    public static int number = 0;
    public static int sequence = 1;
    // Returns the next Triangular number
    public static int nextTraingularNumber(){
        int temp = number + sequence;
        number = temp;
        sequence++;
        return temp;
    }

    public static void main(String[] args) {
        while(true){
            int i = nextTraingularNumber();
            if(getDivisors(i)>500){
                System.out.println("Found : " + i);
                break;
            }
        }
    }

}
