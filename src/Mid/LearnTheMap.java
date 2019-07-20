package Mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LearnTheMap {
    public static void main(String[] args){
        System.out.println(learntTheMap().get("Deutschland"));
    }

    public static List<String> learnTheList(String[] words){
        System.out.println("Wir sind hier in der String List!");
        List<String> liste = new ArrayList<String>();
        liste.add("Hallo");
        for (String str:words
             ) {
            liste.add(str);
        }
        return liste;
    }
    public static List<Integer> learnTheList(int[] words){
        System.out.println("Wir sind hier in der Integer Liste!");
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(5);
        for (Integer ints:words
        ) {
            liste.add(ints);
        }
        return liste;
    }

    public static HashMap<String,String> learntTheMap(){
        HashMap<String, String> hauptStaedte = new HashMap<>();
        hauptStaedte.put("England","London");
        hauptStaedte.put("Deutschland","Berlin");
        hauptStaedte.put("Russland","Moskau");
        return hauptStaedte;
    }
}
