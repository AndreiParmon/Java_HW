package Lesson1.homeWork;

public class Task3 {
    public static void outputOfPrimeNumbers() {
        int number = 1000;
        for (int i = 2; i <= number; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    temp++;
            }
            if(temp <= 2){
                System.out.print(i + " ");
            }
        }
    }
}
