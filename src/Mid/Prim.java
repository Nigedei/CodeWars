package Mid;

public class Prim {
    public static String backwardsPrime(long start, long end ) {
        StringBuilder result = new StringBuilder();
        for(long i = start; i<=end;i++){
            if(isPrime(i)) {
                if(isPrime(rotate(i))){
                    if(checkSim(i,rotate(i)))
                        result.append(" ").append(i);
                }
            }
        }
        return result.toString().trim();
    }

    private static boolean checkSim(long a, long b){
        if(a==b)
            return false;
        return true;
    }
    private static long rotate(long y){
        char input[] = (""+y).toCharArray();
        String result = "";
        for(int i = input.length-1; i>=0;i--){
            result+=input[i];
        }
        return Long.parseLong(result);
    }

    private static boolean isPrime(long x){
        if(x<=1)
            return false;
        for(int i = 2; i <= x/2; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
