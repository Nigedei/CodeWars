package Mid;

public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end)
    {
        int sum = 0;
        outer:for(int i = start; i<=end; i++){
            char[] j = (i+"").toCharArray();
            for (char c:j
                 ) {
                if(c=='5'){
                    continue outer;
                }
            }
            sum++;
        }
        return sum;
    }
}
