public class Task6 {
    public static void main(String[] args){
          System.out.println(task6(0));
    }
    // This function takes any number of numbers and returns the highest number:
    static  int task6(int...numbers) {
        int maxNumber = Integer.MIN_VALUE; // I used the MIN_VALUE constant from the Integer wrapper class,
                                          // the value is going to be stored in the variable maxNumber.

        for (int Number : numbers){
            if(Number > maxNumber) {      // The number that is greater than maxNumber is assigned to Number,
                maxNumber = Number;       // which is going to be the returned  maximum number in the arguments.
            }
        }
        return maxNumber;
    }

        }

