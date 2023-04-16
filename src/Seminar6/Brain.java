package Seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Brain {
    public static Set<Laptop> laptopSet = new HashSet<>();
    public static Map<Integer, Laptop> laptopMap = new HashMap<>();


    public static void laptopOut() {
        Laptop laptop = new Laptop(Brand.SAMSUNG, Color.BLACK);
        Laptop laptop1 = new Laptop(Brand.LENOVO, Color.GREY);
        Laptop laptop2 = new Laptop(Brand.ASUS, Color.WHITE);
        Laptop laptop3 = new Laptop(Brand.SAMSUNG, Color.GREY);
        Laptop laptop4 = new Laptop(Brand.ACER, Color.GREY);

        laptopSet.add(laptop);
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);


        laptopMap.put(1, laptop);
        laptopMap.put(2, laptop1);
        laptopMap.put(3, laptop2);
        laptopMap.put(4, laptop3);
        laptopMap.put(5, laptop4);
    }



    public static void colorLaptop(Color color) {
        for (Map.Entry<Integer, Laptop> entry : laptopMap.entrySet()) {
            if (entry.getValue().color.equals(color)) {
                System.out.println(entry);
            }
        }
    }


    public static void BrandLaptop(Brand brand) {
        for (Map.Entry<Integer, Laptop> entry : laptopMap.entrySet()) {
            if (entry.getValue().brand.equals(brand)) {
                System.out.println(entry);
            }
        }
    }


}


