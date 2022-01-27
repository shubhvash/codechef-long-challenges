package JAN221C;

import java.util.Scanner;

public class COVSPRD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();

            if (d == 0) {
                System.out.println("1");
                continue;
            }

            int infected = -1;

            if (d>=1 && d<=10) {
                infected = (int)Math.pow(2, d);
            } else {
                if (d <= 21)
                    infected = (int) (1024 * Math.pow(3, d-10));
                else infected = (int) (1024 * Math.pow(3, 11));
            }

            System.out.println(Math.min(infected, n));
        }
    }
}
