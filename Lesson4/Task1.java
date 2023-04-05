//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package lesson4.homeWork;

import java.util.LinkedList;

public class Task1 {
    public static void flippedList() {
        int[] array = {1,4,7,8,9,6,3,2,0};

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            list.push(array[i]);
        }
        System.out.println(list);
    }
}
