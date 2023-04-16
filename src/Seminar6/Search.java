package Seminar6;

import java.util.Scanner;

import static Seminar6.Brain.*;

public class Search {


    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            laptopOut();
            System.out.println("Введите критерии отбора:\n" +
                    "1 - Фирма\n" +
                    "2 - Цвет\n ");
            int userSh = scanner.nextInt();
            if (userSh == 1) {

                System.out.println("1 - Samsung\n" +
                        "2 - Acer\n" +
                        "3 - Lenovo\n" +
                        "4 - Asus\n");

                int userShBrand = scanner.nextInt();
                if (userShBrand == 1) {
                    BrandLaptop(Brand.SAMSUNG);
                }
                if (userShBrand == 2) {
                    BrandLaptop(Brand.ACER);
                }
                if (userShBrand == 3) {
                    BrandLaptop(Brand.LENOVO);
                }
                if (userShBrand == 4) {
                    BrandLaptop(Brand.ASUS);
                }
            }


            if (userSh == 2) {
                System.out.println("1 - Grey\n" +
                        "2 - Black\n" +
                        "3 - White");

                int userShColor = scanner.nextInt();
                if (userShColor == 1) {
                    colorLaptop(Color.GREY);
                    if (userShColor == 2)
                        colorLaptop(Color.BLACK);
                    if (userShColor == 3)
                        colorLaptop(Color.WHITE);

                }

            }


        }


    }
}

