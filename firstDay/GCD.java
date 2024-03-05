package firstDay;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int ans = 1;
            for (int i = 1; i <= Math.min(n1, n2); i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ans = i;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
