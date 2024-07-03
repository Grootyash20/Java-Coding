public class stringrev {

    public static String rev1(String str) {
        String newstr = "";
        StringBuilder sb = new StringBuilder(str);
        newstr = sb.reverse().toString();
        return newstr;
    }

    public static String rev2(String str) {
        String newstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newstr = ch + newstr;
        }
        return newstr;

    }

    public static void main(String[] args) {
        String str = "Groot";
        System.out.println(rev1(str));
        System.out.println(rev2(str));
    }
}
