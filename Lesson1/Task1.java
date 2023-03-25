package Lesson1.homeWork;

public class Task1 {
    public static void triangularNumberCalculation(int count) {
        int number = 0;
        for (int i = 0; i <= count; i++){
            number += i;
        }
        System.out.printf("Треугольное число " + count + " = " + number);
    }
}
