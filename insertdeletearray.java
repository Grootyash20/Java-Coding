import java.util.*;

public class insertdeletearray {

    public static void insert(int index, int value) {
        int[] arr = new int[] { 1, 2, 4, 5 };
        int[] newarr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newarr, 0, index);
        newarr[index] = value;
        System.arraycopy(arr, index, newarr, index + 1, arr.length - index);
        arr = newarr;
        for (Integer i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void delete(int index) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] newarr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newarr, 0, index);
        System.arraycopy(arr, index + 1, newarr, index, arr.length - index - 1);
        arr = newarr;
        for (Integer i : arr) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        insert(2, 3);
        delete(2);
    }
}
