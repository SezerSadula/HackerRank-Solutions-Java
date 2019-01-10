import java.io.*;
import java.util.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        char[] chars = s.toCharArray();
        int one = 0;
        Arrays.sort(chars);
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int odd = 0;
        int even = 0;
        for (Integer integer : map.values()) {
            if (integer % 2 == 1) {
                odd++;
                continue;
            }
            if (integer % 2 == 0) {
                even++;
            }
        }
        if (odd > 1) {
            return "NO";
        } else {
            return "YES";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
