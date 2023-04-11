package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class NameCounter {

    public static void printDuplicateNames(String[] names) {
        Map<String, Integer> nameCounts = new HashMap<>();

        for (String name : names) {
            if (nameCounts.containsKey(name)) {
                int count = nameCounts.get(name);
                nameCounts.put(name, count + 1);
            } else {
                nameCounts.put(name, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(name + " - " + count + " times");
            }
        }
    }
}
