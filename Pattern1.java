public class Pattern1 {

    public static void pat1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pat2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pat3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pat4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pat5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pat6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pat7(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pat8(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pat9(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pat10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (stars > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pat11(int n) {
        int dig = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                dig = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(dig);
                dig = 1 - dig;
            }
            System.out.println();
        }
    }

    public static void pat12(int n) {
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pat12(4);
    }
}
//All patterns on take U forward
