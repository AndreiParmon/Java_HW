//Реализовать разность массивов и симметрическую разность

package lesson3.homeWork;

import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    public static void differenceSymmetryArrays() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(8);
        System.out.println("Список 1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(8);
        list2.add(13);
        list2.add(18);
        System.out.println("Список 2: " + list2);

        ArrayList<Integer> list3 = new ArrayList<>(list1);
        list3.removeAll(list2);
        ArrayList<Integer> list4 = new ArrayList<>(list2);
        list4.removeAll(list1);
        list3.addAll(list4);
        System.out.println("Разность: " + list3);

        list1.retainAll(list2);
        System.out.println("Симметричность: " + list1);
    }
}
