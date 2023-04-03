package Seminar1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class YouTube {
    public static void main(String[] args) {
        byte[] num = new byte[]{5, 6, 8};
        int sum1 = sumArray(num);
        System.out.println(sum1);
    }

    public static int sumArray(byte[] a) {
        int sum = 0;
        for (byte i = 0; i < a.length; i++)
            sum += a[i];

        return sum;
    }


}