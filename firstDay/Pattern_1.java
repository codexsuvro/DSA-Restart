package firstDay;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.err.println();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}