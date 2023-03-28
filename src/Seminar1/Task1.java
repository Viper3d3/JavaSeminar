package Seminar1; // Создать Калькулятор.

import java.util.Scanner;
import java.util.Objects;

public class Task1 {
    public static String result() {
        String[] array1 = userInput();

        int first = Integer.parseInt(array1[0]);  // Разбиваем массив из строкового в интовый и стройковый для символа ' '
        int second = Integer.parseInt(array1[1]);
        String operationFS = array1[2];
        int res = 0;
        if (Objects.equals(operationFS, "+")) {
            res = first + second;
        } else if (Objects.equals(operationFS, "-")) {
            res = first - second;
        } else if (Objects.equals(operationFS, "/")) {
            res = first / second;
        } else if (Objects.equals(operationFS, "*")) {
            res = first * second;
        } else {
            System.out.println("Incorrect in data ");
        }
        return System.out.printf("%d %s %d = %d \n", first, operationFS, second, res).toString(); // результат выводит в строковм значении.
    }

    public static String[] userInput() {
        Scanner scan = new Scanner(System.in);
        String[] array = new String[3];

        System.out.println("Введите первое число: ");
        String num1 = scan.nextLine();

        System.out.println("Введите второе число: ");
        String num2 = scan.nextLine();

        System.out.println("Введите символ операции: +, -, /, * ");
        String operation = scan.nextLine();

        array[0] = num1;   // заполняем массив по индексу , что ввел пользователь.
        array[1] = num2;
        array[2] = operation;
        return array;  // возвращаем результат.


    }


}



