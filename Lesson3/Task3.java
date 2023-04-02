//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

package lesson3.homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void minMaxAverage() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Список: " + list);

        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
        float sum = 0;
        float average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        System.out.println("Average: " + average);

    }
}
