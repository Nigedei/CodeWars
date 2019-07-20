package Mid;
import java.util.*;

public class LeaderGame {
    public static List arrayLeaders(int[] numbers)
    {
        int sum = 0;
        List<Integer> myList = new ArrayList<Integer>();

        for (int i:numbers
             ) {
            sum+=i;
        }

        for (int i:numbers
             ) {
            sum-=i;
            if(i>sum){
                myList.add(i);
            }
        }
        return myList; // Do your magic!
    }
}
