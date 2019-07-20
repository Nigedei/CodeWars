package Mid;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        // your code

        //conditions
        boolean check1 = h > 0;
        boolean check2 = 0 < bounce && bounce < 1;
        boolean check3 = window < h;
        boolean checkAll = check1 && check2 && check3;

        //mathmagic
        int pass = 1;

        if (checkAll){
            for(int i = 1; h*Math.pow(bounce,i) > window;i++){
                pass++;
                pass++;
            }
        }

        return checkAll ? pass : -1;
    }
}