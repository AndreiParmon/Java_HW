package Lesson1.homeWork;

public class Task4 {
    public static void calculator(String operation, int number1, int number2) {
        if(operation.equals("+")){
            int result = 0;
            result = number1 + number2;
            System.out.printf(number1 + " + " + number2 + " = " + result);
        }
        if(operation.equals("-")){
            int result = 0;
            result = number1 - number2;
            System.out.printf(number1 + " - " + number2 + " = " + result);
        }
        if(operation.equals("*")){
            int result = 0;
            result = number1 * number2;
            System.out.printf(number1 + " * " + number2 + " = " + result);
        }
        if(operation.equals("/")){
            int result = 0;
            result = number1 / number2;
            System.out.printf(number1 + " / " + number2 + " = " + result);
        }
    }
}
