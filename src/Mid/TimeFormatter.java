package Mid;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        // your code goes here
        int years = seconds / (365*24*60*60);

        int days = seconds % (365*24*60*60) / (24*60*60);

        int hours = seconds % (365*24*60*60) % (24*60*60) / (60*60);

        int minutes = seconds % (365*24*60*60) % (24*60*60) % (60*60) / (60);

        int scnds = seconds % (365*24*60*60) % (24*60*60) % (60*60) % 60;
        return formatAnswer(years, days, hours, minutes, scnds);
    }

    public static String formatAnswer(int y, int d, int h, int m, int s){
        String result = "";
        if(y > 0){
            result += y;

            if(y == 1){
                result += " year";
            }else{
                result += " years";
            }

            if(checkExist(d,h,m,s)>1){
                result += ", ";
            }else if(checkExist(d,h,m,s)==1){
                result += " and ";
            }
        }

        if(d > 0){
            result += d;

            if(d == 1){
                result += " day";
            }else{
                result += " days";
            }

            if(checkExist(h,m,s)>1){
                result += ", ";
            }else if(checkExist(h,m,s)==1){
                result += " and ";
            }
        }

        if(h > 0){
            result += h;

            if(h == 1){
                result += " hour";
            }else{
                result += " hours";
            }

            if(m>0 & s>0){
                result += ", ";
            }else if(m>0||s>0){
                result += " and ";
            }
        }

        if(m > 0){
            result += m;

            if(m == 1){
                result += " minute";
            }else{
                result += " minutes";
            }

            if(s>0){
                result += " and ";
            }
        }

        if(s>0){
            result += s;

            if(s == 1){
                result += " second";
            }else{
                result += " seconds";
            }
        }
        return ((checkExist(y,d,h,m,s) == 0) ? "now" : result);
    }

    public static int checkExist(int... args){
        int result = 0;
        for (int arg:args
             ) {
            if(arg>0){
                result++;
            }
        }
        return result;
    }
}
