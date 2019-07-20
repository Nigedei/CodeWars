package Mid;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        int doppel = 0;
        String nText = text.toLowerCase();
        char[] digits = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

        for (char dig : digits
        ) {
            int count = text.length() - text.replace((""+dig).toLowerCase(), "").length();
            if (count>=2){
                doppel++;
            }
        }
        return doppel;
    }
}