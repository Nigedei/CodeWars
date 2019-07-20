package Mid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i:elements
             ) {
            if(check(list,i,maxOccurrences-1)){
                list.add(i);
            }
        }

        System.out.println("Liste fertig!\n"+list);

        int[] result = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
    public static boolean check(List<Integer> list, int j, int max){
        return Collections.frequency(list, j)<=max;
    }
}