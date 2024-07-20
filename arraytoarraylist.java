import java.util.*;

public class arraytoarraylist {
    public static void main(String[] args) {
        String[] arr = { "a", "b", "c" };
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList(arr));

        arrlist.add("d");
        arrlist.add("e");

        System.out.println(arrlist);

        String[] newarr = arrlist.toArray(new String[0]);
        int count = 0;
        for (String i : newarr) {
            System.out.print(i);
            count++;
            if (count < newarr.length) {
                System.out.print(",");
            }
        }

    }
}
