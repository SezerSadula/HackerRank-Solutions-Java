import java.io.*;
import java.util.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int sumFirst = 0;
        int sumSecond = 0;
        int rows = arr.length;
        int cols = arr.length;
        int j = 0;
        int k = cols - 1;
        for (int i = 0; i < rows; i++) {
            while (j < cols) {
                while (k >= 0) {
                    sumSecond += arr[i][k];
                    k--;
                    break;
                }
                sumFirst += arr[i][j];
                j++;
                break;
            }
        }
        int difference = sumFirst - sumSecond;
        return Math.abs(difference);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
