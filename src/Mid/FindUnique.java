package Mid;

public class FindUnique {
    public static double findUniq(double arr[]) {
        // Do the magic
        if(checkFirst(arr)){
            for (double d:arr
                 ) {
                if(arr[0]!=d){
                    return d;
                }
            }
        }
        return arr[checkSecond(arr)];
    }
    private static boolean checkFirst(double arr[]){
        if(arr[0]==arr[1])
            return true;
        else
            return false;
    }

    private static int checkSecond(double arr[]){
        if(arr[0]==arr[2])
            return 1;
        return 0;
    }
}