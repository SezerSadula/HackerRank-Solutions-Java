import java.util.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        String space = " ";
        String hashTag = "#";

        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            int tags = i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(space);
            }
            for (int j = 0; j < tags; j++) {
                System.out.print(hashTag);
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
