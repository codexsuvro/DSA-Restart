package firstDay;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    static void reverseArray(int[] a, int start, int end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = 5;
            int[] a = {5, 4, 3, 2, 1};
            reverseArray(a, 0, n-1);
            printArray(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
