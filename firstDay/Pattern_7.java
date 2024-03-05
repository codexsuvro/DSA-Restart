package firstDay;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (char ch = 'A'; ch <= 'A' + i; ch++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (char ch = 'A'; ch <= 'A' + (n-i-1); ch++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
