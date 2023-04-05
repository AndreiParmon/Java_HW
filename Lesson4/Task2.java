//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

package lesson4.homeWork;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {
    public static void queueMethods() {
        int[] array = {1,4,7,8,9,6,3,2,0};
        Queue<Integer> list = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println("Первоначальная очередь -> " + list);

        list.add(5);
        System.out.println("enQueue -> " + list);


        System.out.println("Возвращаемый элемент -> " + list.remove());
        System.out.println("deQueue -> " + list);


        System.out.println("Возвращаемый элемент -> " + list.peek());
        System.out.println("first" + list);
    }
}
