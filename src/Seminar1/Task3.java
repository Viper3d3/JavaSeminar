package Seminar1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task3 {
    public static int sum(int num) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите число для поиска треугольного числа: ");
//        int num1 = scan.nextInt();
//
//        int sum;
//        sum = num1 * (num1 + 1) /2;
//        return sum;
//    }
//
//
        int sum = 1;
        for (int i = 1; i < num + 1; i++) {
            sum = sum + i;

        }
        return sum;

    }


    public static int sumFact(int num) {
                                                // поиск факториала
        int sum = 1;
        for (int i = 1; i < num + 1; i++) {
            sum = sum * i;

        }
        return sum;

    }
//



}



