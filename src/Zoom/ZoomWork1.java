package Zoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ZoomWork1 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> ListArr = new ArrayList<>();
        ListArr.add(random.nextInt(11));
        ListArr.add(random.nextInt(11));
        ListArr.add(random.nextInt(11));
        ListArr.add(random.nextInt(11));
        ListArr.add(random.nextInt(11));
        ListArr.add(random.nextInt(11));
        ListArr.add(random.nextInt(11));
        ListArr.add(random.nextInt(11));


        System.out.println(ListArr);
        Collections.sort(ListArr);
        System.out.println(ListArr);
    }
}