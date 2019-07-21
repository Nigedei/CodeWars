package Mid;

import java.util.ArrayList;
import java.util.List;

public class Kasse {
    public static String Tickets(int[] peopleInLine)
    {
        //Your code is here...
        List<Integer> cash = new ArrayList<Integer>();
        String can = "NO";

        for (int i:peopleInLine
             ) {
            if(i==25){
                cash.add(1);
                can="YES";
            }
            else if(checkCash(cash,1)>=1&& i==50){
                cash.add(2);
                cash.remove(new Integer(1));
                can="YES";
            }
            else if(checkIfEnough(cash)>0 && i==100){
                switch(checkIfEnough(cash)){
                    case 1:
                        cash.add(3);
                        cash.remove(new Integer(2));
                        cash.remove(new Integer(1));
                        break;
                    case 2:
                        cash.add(3);
                        cash.remove(new Integer(1));
                        cash.remove(new Integer(1));
                        cash.remove(new Integer(1));
                        break;
                }
                can="YES";
            }else{
                can="NO";
                break;}
        }
        return can;
    }

    public static int checkIfEnough(List<Integer> cash){
        int answer = 0;
        if(checkCash(cash,2) >= 1  && checkCash(cash,1)>=1){
            answer = 1;
        }else if(checkCash(cash,1)>=3){
            answer = 2;
        }else{
            System.out.println("else in checker 1 thru");
        }
        return answer;
    }

    public static int checkCash(List<Integer> cash,int which){
        List<Integer> tempCash = new ArrayList<>(cash);
        int sum = 0;
        while(tempCash.contains(which)){
            sum++;
            tempCash.remove(new Integer(which));
        }
      return sum;
    }
}
