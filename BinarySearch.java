public class BinarySearch {

    public static int BSearch(int[] arr, int num) {
        int n = arr.length;
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        System.out.println(BSearch(arr, 11));
    }
}
