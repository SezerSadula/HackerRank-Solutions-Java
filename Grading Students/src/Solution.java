import java.io.*;
import java.util.*;

public class Solution {

    static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int current = grades[i];
            int currentRounded = 0;
            currentRounded = (current + 4) / 5 * 5;
            if (current >= 38) {
                if (currentRounded - current < 3) {
                    result[i] = currentRounded;
                } else if (currentRounded - current >= 3) {
                    result[i] = current;
                }
            } else {
                result[i] = current;
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
