package firstDay;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = Integer.toString(n); // Time Complexity: O(1)
            System.out.println(s.length()); // Space Complexity: O(1)
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
