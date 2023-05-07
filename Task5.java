
public class Task5 {
    public static void main(String[] args) {
        System.out.println(task5(100,200,10));

    }
      // This function returns the highest number from the arguments:
    // I used the nested if statements to check the highest number.
    public static int task5(int a, int b, int c) {
        int maxValue;  // The returned highest number is going to be stored in the variable maxValue.
        if(a>=b){
            if(a>=c){
                maxValue = a;
            }
            else{
                maxValue = c;
            }
        } else{
            if (b>=c){
                maxValue = b;
            }
            else{
                maxValue = c;
            }
        }

        return maxValue;
    }
}











