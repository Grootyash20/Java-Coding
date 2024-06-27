public class Palindrome {

    public static void StrPalindrome(String str) {
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
        if (str.equals(nstr)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }

    public static void NumPalindrome(int num) {
        int onum = num;
        int resultnum = 0;
        int remainder = 0;
        while (onum != 0) {
            remainder = onum % 10;
            resultnum = resultnum * 10 + remainder;
            onum = onum / 10;
        }
        if (resultnum == num) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

    public static void main(String[] args) {
        NumPalindrome(121);
        StrPalindrome("bob");
    }
}
