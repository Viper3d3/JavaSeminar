package Seminar3;

import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(14);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);

        int sum = 0;
        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float average = (float) sum / list.size();
        System.out.println("Минимальное число : " + min);
        System.out.println("Масксимальное число : " + max);
        System.out.println("Среднее арифметическое : " + average);

    }
}

