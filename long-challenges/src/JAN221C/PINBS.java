package JAN221C;

import java.util.Scanner;

public class PINBS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();

            if (str.contains("10") || str.contains("11")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
