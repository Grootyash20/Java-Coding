public class SelectionSort {
    // 7 8 3 1 2

    public static void SSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    //Time Complexity : O(n^2)

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        SSort(arr);
    }
}
