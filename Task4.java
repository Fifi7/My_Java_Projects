
// This program calculates the area of a triangle using the Heron's formula.

public class Task4 {
    public static void main(String[] args){
        System.out.println("The area is :"  + (task4(3,4,5)));
    }
      public static double task4(double a, double b, double c) {
          // this line calculates the semiperimeter of the triangle.
          double semi = (a + b + c) * 1/2;
          double area = Math.sqrt((semi * (semi - a) * (semi - b) * (semi - c))); // This line of code calculates the area of
                                                                                      //  a triangle using the Heron's formula.
          return area;


      }
}