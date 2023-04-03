package Zoom;

import java.util.ArrayList;
import java.util.List;

public class ZoomWork4 {
    public static void main(String[] args) {
        ArrayList<String> planeets = new ArrayList<>();
        planeets.add("Земля");
        planeets.add("Марс");
        planeets.add("Венера");
        planeets.add("Земля");
        planeets.add("Земля");
        planeets.add("Марс");
        ArrayList<Integer> countplaneets = new ArrayList<>();
        ArrayList<String> resultplaneets = new ArrayList<>();
        for (String planet : planeets ) {
            int position = resultplaneets.indexOf(planet);
            if(position >= 0 ){
                countplaneets.set(position, countplaneets.get(position) + 1);
            }else{
                resultplaneets.add(planet);
                countplaneets.add(1);
            }



        } printPlanetCount(resultplaneets,countplaneets);


    }
    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }
}
