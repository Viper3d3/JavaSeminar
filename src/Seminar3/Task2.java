package Seminar3;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        System.out.println("Первоначальный список: " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) ;
            list.remove(i);
        }
        System.out.println("Конечный список, без четных чисел: " + list);

    }
}
