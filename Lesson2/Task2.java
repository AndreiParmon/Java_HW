//Дана строка json:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

package lesson2.homeWork;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Task2 {
    public static void textDivision() {
        try {
            String json = "[{\"Фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, \n" +
                        "{\"Фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, \n" +
                        "{\"Фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

            JSONParser parser = new JSONParser();
            Object object = parser.parse(json);
            JSONArray jsonarray = (JSONArray) object;
            for (int i = 0; i < jsonarray.size(); i++) {
                JSONObject jsonObject = (JSONObject) jsonarray.get(i);
                System.out.println("Студент " + jsonObject.get("Фамилия") +
                        " получил " + jsonObject.get("оценка") +
                        " по предмету " + jsonObject.get("предмет") + ".");
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
