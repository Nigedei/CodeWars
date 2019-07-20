package Mid;

public class Persist {
    public static int persistence(long n) {
        // your code
        int sum = 0;
        long para = n;
        while(para>=10){
            char[] c = (""+para).toCharArray();
            para = 0;
            for (int i = 0; i<c.length;i++){
                if(i==0){
                    para=c[i]-48;
                }else{
                    para*=c[i]-48;
                }
            }
            sum++;
        }
        return sum;
    }
}
