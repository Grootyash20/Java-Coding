public class Armstrong {

    public static void Armstrongfn(int num) {
        int onum = num;
        double resultnum = 0;
        int remainder = 0;
        while (onum != 0) {
            remainder = onum % 10;
            resultnum = resultnum + Math.pow(remainder, 3);
            onum = onum / 10;
        }
        if (resultnum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Armstrongfn(371);
    }
}
