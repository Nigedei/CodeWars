package Mid;

public class FindShortest {
    public static int findShort(String s) {
        int length = 100;
        String[] words = s.split("\\W+");
        for (String word:words
             ) {
            if(word.length()<length){
                length=word.length();
            }
        }
        return length;
    }
}
