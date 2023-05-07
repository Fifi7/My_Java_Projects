// This program converts any number into hours and minutes:
public class Task8 {
    public static void main(String [] args){
        System.out.println(task8(1));
    }
    public static String task8(int x){
        int hours = x/60;
        int minutes = x % 60;

        String hr = "hours";
        String min = "minutes";

        if(hours == 1 ) {
            hr = "hour";
        }
        if(minutes ==1 ){
            min = "minute";
        }
        return hours + " "+hr+"," + " " +minutes+ " "  +min;

            }


        }







