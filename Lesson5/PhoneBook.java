//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//Пусть дан список сотрудников:
//Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов,
//Иван Иванов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Иван Иванов, Мария Рыкова, Анна Крутова,
//Марина Лугова, Анна Владимирова, Петр Лыков, Иван Мечников, Петр Петин, Петр Лыков, Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.

package lesson5.homeWork;

import java.util.*;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new HashMap<>();

    public static void employeesAndPhones() {
        phoneBook.put("123456", "Иван Иванов");
        phoneBook.put("612345", "Светлана Петрова");
        phoneBook.put("651234", "Кристина Белова");
        phoneBook.put("654123", "Анна Мусина");
        phoneBook.put("654312", "Анна Крутова");
        phoneBook.put("654321", "Иван Юрин");
        phoneBook.put("165432", "Петр Лыков");
        phoneBook.put("126543", "Павел Чернов");
        phoneBook.put("123654", "Иван Иванов");
        phoneBook.put("123465", "Петр Чернышов");
        phoneBook.put("456789", "Мария Федорова");
        phoneBook.put("945678", "Марина Светлова");
        phoneBook.put("984567", "Мария Савина");
        phoneBook.put("987456", "Иван Иванов");
        phoneBook.put("987645", "Мария Рыкова");
        phoneBook.put("987654", "Анна Крутова");
        phoneBook.put("498765", "Марина Лугова");
        phoneBook.put("459876", "Анна Владимирова");
        phoneBook.put("456987", "Петр Лыков");
        phoneBook.put("456798", "Иван Мечников");
        phoneBook.put("147896", "Петр Петин");
        phoneBook.put("123698", "Петр Лыков");
        phoneBook.put("357412", "Иван Ежов");

        for (String i : phoneBook.keySet()) {
            System.out.println(i + " = " + phoneBook.get(i));
        }
        System.out.println();

        ArrayList<String> values = new ArrayList<>(phoneBook.values());

        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(String item : values){
            int position = result.indexOf(item);
            if(position >= 0){
                count.set(position, count.get(position)+1);
            }else {
                result.add(item);
                count.add(1);
            }
        }
        printEmployeesAndPhones(result,count);
    }
    private static void printEmployeesAndPhones(List<String> result, List<Integer> count) {
        for (int i = 0; i < result.size(); i++) {
            if(count.get(i) >= 2) {
                System.out.printf("%-10s : %3d%n", result.get(i), count.get(i));
            }
        }
    }
}
