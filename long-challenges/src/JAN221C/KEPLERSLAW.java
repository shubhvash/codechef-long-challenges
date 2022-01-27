package JAN221C;

import java.util.Scanner;

public class KEPLERSLAW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            double k1 = ((double)(t1 * t1)) / (r1 * r1 * r1);
            double k2 = ((double)(t2 * t2)) / (r2 * r2 * r2);

            System.out.println(k1 == k2 ? "Yes" : "No");
        }
    }
}
