package Mid;

import java.util.HashMap;

public class CapitalGame {
    enum mode{AUSWAHL,EINGABE};
    private static HashMap<String, String> geo = new HashMap<>();

    public static void main (String[] args){
        initList();
        System.out.println("Welchen Modus willst du spielen?\n");

    }

    private static void initList(){
        geo.put("Deutschland","Berlin");
        geo.put("Ukraine","Kiew");
        geo.put("Russland","Moskau");
        geo.put("England","London");
        geo.put("Niederlande","Amsterdam");
        geo.put("China","Peking");
        geo.put("Österreich","Wien");
        geo.put("Spanien","Madrid");
    }
    private static String mode(mode mo) {
        switch (mo) {
            case AUSWAHL:
                System.out.println("Modus: Auswahl");
        }
    }
}
