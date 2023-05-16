import java.util.TreeSet;

public class Task10 {
    public static void main(String[] args) {

        task10("Computers", "House");
    }

    public static void task10(String x, String y) {
        char[] String1 = x.toLowerCase().replaceAll("\\s+", "").toCharArray();

        char[] String2 = y.toLowerCase().replaceAll("\\s+", "").toCharArray();

        TreeSet<Character> stringSet1 = new TreeSet<>();

        TreeSet<Character> stringSet2 = new TreeSet<>();

        String OutPut = "no common letters";

        for (char c : String1) {
            stringSet1.add(c);
        }

        for (char c : String2) {
            stringSet2.add(c);
        }
        stringSet1.retainAll(stringSet2);

        if (!stringSet1.isEmpty()) {
            char lastChar = stringSet1.last();
            if (stringSet1.size() == 1) {
                OutPut = stringSet1.toString().replace("[", "").replace("]", "");

            } else {
                stringSet1.remove(stringSet1.last());
                OutPut = stringSet1.toString().replace("[", "").replace("]", "") + " " + "and" + " " + lastChar;
            }
        }
            System.out.println(OutPut);

        }
    }












