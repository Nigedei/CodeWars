package Mid;

public class PigLatin {
    public static String pigIt(String str) {
        String result = "";
        for (String g:str.split(" ")
             ) {
            if (Character.isLetter(g.charAt(0))){
                g += g.charAt(0);
                result += g.substring(1)+"ay ";
            }
            else{
                result += g+" ";
            }
        }
        return result.trim();
    }
}