package Mid;

public class NumberGameTwo {

    public static String isStrongNumber(int num) {
        int sum = 0;
        String number = ""+num;
        char[] numbs = number.toCharArray();

        for(int i = 0; i<numbs.length;i++){
            sum+=factorial(numbs[i]);
        }

        if(sum==num){
            return "STRONG!!!!";
        }else{
            return "Not Strong !!";
        }
    }

    public static int factorial(int num){
        num=num-48;
        int fac = 0;

        if(num>1){
            fac=+num;
            for(int i=num; i>1; i--){
                fac =+ fac*(i-1);
            }
        }else if(num<=1){
            fac=num;
        }

        return fac;
    }
}
