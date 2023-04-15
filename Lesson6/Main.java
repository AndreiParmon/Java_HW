//Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
//Создать множество ноутбуков.Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру.

package lesson6.homeWork;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("APPLE", "GREY"));
        laptops.add(new Laptop("APPLE", "BLACK"));
        laptops.add(new Laptop("HP", "WHITE"));
        laptops.add(new Laptop("HP", "RED"));
        laptops.add(new Laptop("ASUS", "BLACK"));
        laptops.add(new Laptop("ASUS", "GREY"));
        laptops.add(new Laptop("LENOVO", "RED"));
        laptops.add(new Laptop("LENOVO", "WHITE"));


        Map<Integer, Laptop> laptopList = new HashMap<>();
        int count = 1;
        for (Laptop obj : laptops) {
            laptopList.put(count++, obj);
        }
        System.out.println(laptopList);

        Set<String> resultLaptops = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите цифру, соответствующую необходимому критерию: \n" +
                "1 - Бренд\n" +
                "2 - Цвет");
        String input = scanner.next();
        if (input.equalsIgnoreCase("1")) {
            System.out.println("Введите название бренда -> ");
            input = scanner.next().toUpperCase();
            for (Map.Entry<Integer, Laptop> entry : laptopList.entrySet()) {
                if (input.equals(entry.getValue().Brand)) {
                    resultLaptops.add(entry.toString());
                }
            }
        }
        if(input.equalsIgnoreCase("2")){
            System.out.println("Введите цвет ноутбука -> ");
            input = scanner.next().toUpperCase();
            for (Map.Entry<Integer, Laptop> entry : laptopList.entrySet()) {
                if (input.equals(entry.getValue().Color)){
                    resultLaptops.add(entry.toString());
                }
            }
        }

        System.out.println("Количество найденых совпадений -> " + resultLaptops.size());
        for (String item : resultLaptops) {
            System.out.println(item);
        }
    }
}
