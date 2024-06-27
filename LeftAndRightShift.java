public class LeftAndRightShift {

    public static void Lshift(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }
        for (int j = 0; j < temp.length; j++) {
            System.out.print(temp[j] + " ");
        }
        System.out.println();
    }

    public static void Rshift(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        for (int j = 0; j < temp.length; j++) {
            System.out.print(temp[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Lshift(arr, 2);
        Rshift(arr, 2);
    }
}
