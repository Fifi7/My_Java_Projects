public class Task2 {
    public static void main(String[] args) {
        task2();
    }
    static void task2(Object... name) {
        if (name.length > 0) {
            if (name[0] != null) {
                System.out.println("Hello" + " " + name[0] + "!");
            }
            } else {
                System.out.println("Hello Friend!");
            }
        }
    }



