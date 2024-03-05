package firstDay;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int s = 2*(n-1);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j <= s; j++){
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                s -= 2;
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
