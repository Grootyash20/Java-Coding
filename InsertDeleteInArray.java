public class InsertDeleteInArray {

    public static int[] Insert(int[] arr, int element, int position) {
        int n = arr.length;
        int[] narr = new int[n + 1];
        for (int i = 0; i < position; i++) {
            narr[i] = arr[i];
        }
        narr[position] = element;
        for (int j = position; j < n; j++) {
            narr[j + 1] = arr[j];
        }
        return narr;
    }

    public static int[] Delete(int[] arr, int position) {
        int n = arr.length;
        int[] narr = new int[n - 1];
        for (int i = 0; i < position; i++) {
            narr[i] = arr[i];
        }
        for (int j = position + 1; j < n; j++) {
            narr[j - 1] = arr[j];
        }
        return narr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7 };
        int[] narr = Insert(arr, 4, 2);
        for (int i = 0; i < narr.length; i++) {
            System.out.print(narr[i] + " ");
        }
        System.out.println();
        int[] narr2 = Delete(arr, 2);
        for (int i = 0; i < narr2.length; i++) {
            System.out.print(narr2[i] + " ");
        }

    }
}
