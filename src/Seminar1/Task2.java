package Seminar1;

public class Task2 {
    public static String line() {
        String nums = "2, 3 , 5, 7, ";
        for (int i = 8; i < 1001; i++) {
            if (simple(i) != 0) {
                nums += i + ", ";
            }
        }
        return nums;

    }


public static int simple(int num) {

        if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            return 0;
        } else {
            return num;
        }
    }
}
