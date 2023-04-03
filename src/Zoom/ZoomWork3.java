package Zoom;

import java.util.ArrayList;

public class ZoomWork3 {
    public static void delint () {
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add(1);
        arrayList.add("Ehuu");
        arrayList.add("123");
        arrayList.add(0);
        System.out.println(arrayList);

        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i) instanceof Integer) {
                arrayList.remove(i);
                i--;
            }

        }
        System.out.println(arrayList);
    }
}
