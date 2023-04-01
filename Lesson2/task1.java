//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package lesson2.homeWork;

import lesson2.task.Log;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    private static final Logger LOG = Log.log(Task1.class.getName());

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            LOG.log(Level.INFO, Arrays.toString(array));
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
