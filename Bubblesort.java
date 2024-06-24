class Bubblesort {

    public static void Bsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {// outer loop for no of iterations
            for (int j = 0; j < arr.length - i - 1; j++) {// inner loop for no of comparisons
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        // System.out.println("Hello");
        int[] arr = { 7, 8, 3, 1, 2 };
        Bsort(arr);
    }
}