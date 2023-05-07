import java.util.*;

public class Task9 {

    public static void main(String[] args) {
        System.out.println(task9("Hello there Andy"));

    }
    public static List<String> task9(String Mystr) {
        String convert = Mystr.toLowerCase();

        List vowels = new ArrayList();
        for (int i = 0; i < convert.length(); i++) {
            if (convert.charAt(i) == 'a'  || convert.charAt(i) == 'e'
                    || convert.charAt(i) == 'i'
                    || convert.charAt(i) == 'o' )

                vowels.add(convert.charAt(i));
                Collections.sort(vowels);
            }
            {

            }
        return vowels;
    }
        }









