//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package lesson3.homeWork;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void removingNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Список: " + list);

        for (int i = 0; i < list.size(); i++) {
            if((list.get(i) % 2) == 0) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("Список без чётных чисел: " + list);
    }
}
