package Seminar5;

import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class HashMaps {

    public static void main(String[] args) {

        Map<Integer, String> NameTo = new HashMap<>();
        NameTo.put(1, "Иван Иванов");
        NameTo.put(2, "Светлана Петрова");
        NameTo.put(3, "Кристина Белова");
        NameTo.put(4, "Анна Крутова");
        NameTo.put(5, "Анна Крутова");
        NameTo.put(6, "Иван Юрин");
        NameTo.put(7, "Петр Лыков");
        NameTo.put(8, "Павел Чернов");
        NameTo.put(9, "Иван Иванов");
        TreeMap<Integer, String> sortedByNameTo = new TreeMap<>(NameTo);
        System.out.println("Сортировка по ключу: " + sortedByNameTo);
        List<Map.Entry<Integer, String>> list = new ArrayList<>(NameTo.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> name1, Map.Entry<Integer, String> name2) {
                return name1.getValue().compareTo(name2.getValue());
            }
        });
        Map<Integer, String> sortedByValueNameTo = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedByValueNameTo.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Сортировка по значению: " + sortedByValueNameTo);

        NameCounter.printDuplicateNames(NameTo.values().toArray(new String[0]));







    }
}






