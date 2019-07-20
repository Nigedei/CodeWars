package Mid;

import java.util.ArrayList;
import java.util.List;

public class NumberGameOne {
    public static String balancedNum(long number)
    {
        List<Character> digits = new ArrayList<Character>();
        int firstHalf = 0;
        int lastHalf = 0;
        int length = 0;
        String output;

        for (char c: String.valueOf(number).toCharArray()
             ) {
                    digits.add(c);
        }

        length = digits.size();

        //Even
        if(length % 2 == 0){
            for(int j = 0; j+1 < length/2; j++){
                firstHalf+=digits.get(j);
            }
            for(int k = length/2+1; k < length; k++){
                lastHalf+=digits.get(k);
            }
        }else{         //odd
            for(int j = 0; j < length/2; j++){
                firstHalf+=digits.get(j);
            }
            for(int k = length/2+1; k < length; k++){
                lastHalf+=digits.get(k);
            }
        }

        if(firstHalf == lastHalf){
            output = "Balanced";
        }else{
            output ="Not Balanced";
        }
        return output;
    }
}