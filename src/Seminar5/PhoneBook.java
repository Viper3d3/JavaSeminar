package Seminar5;

import java.util.*;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class PhoneBook {
     public HashMap<String, List> contacts= new HashMap<String, List>();

     public void addPhoneNumber(String name, String famali, String number) {
        List numbers;
        if (contacts.containsKey(name)) {
            numbers = contacts.get(name);
        } else if (contacts.containsKey(famali)) {
            numbers = contacts.get(famali);
        } else {
            numbers = new ArrayList();
            contacts.put(name + " " + famali, numbers);
        }
        numbers.add(number);


    }

    public void printAllNumbers() {
        for (String name : contacts.keySet()) {
            System.out.print(name + ": ");
            List numbers = contacts.get(name);
            for (Object number : numbers) {
                System.out.print( number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что бы добавить номер\t\nвведите цифру [1] \nЧто бы вывести все номера\t\nвведите цифру [2]\n");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Введите имя:");
                String name = scanner.next();
                System.out.println("Введите Фамилию:");
                String famali = scanner.next();
                System.out.println("Введите номер телефона:");
                String number = scanner.next();
                phoneBook.addPhoneNumber(name, famali, number);
            } else {
                if (choice == 2)
                    phoneBook.printAllNumbers();

            }

        }
    }
}
