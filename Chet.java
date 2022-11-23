//  * 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//  *
//  * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.*;

public class Chet {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 21; i++){
            if(i % 2 != 0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);
    }
}
