package Lesson1.homeWork;

public class Task2 {
    public static int factorialCalculation(int count) {
        int result = 1;
        for (int i = 1; i <= count; i++) {
            result = result * i;
        }
        System.out.printf("Факториал числа " + count + " = " + result);
        return result;
    }
}
