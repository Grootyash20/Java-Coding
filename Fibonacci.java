public class Fibonacci {

    public static void Fibonacciprint(int n) {
        int firstnumber = 0;
        int nextnumber = 0;
        int secondnumber = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(firstnumber + ",");
            nextnumber = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextnumber;

        }
    }

    public static void main(String[] args) {
        Fibonacciprint(10);
    }
}
