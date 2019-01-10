import java.util.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] ransom) {
        boolean isPresent = true;
        Map<String, Integer> magazineOccurences = new HashMap<String, Integer>();
        Map<String, Integer> ransomOccurences = new HashMap<String, Integer>();

        for (String word : magazine) {
            if (!magazineOccurences.containsKey(word)) magazineOccurences.put(word, 0);
            magazineOccurences.put(word, magazineOccurences.get(word) + 1);
        }

        for (String word : ransom) {
            if (!ransomOccurences.containsKey(word)) ransomOccurences.put(word, 0);
            ransomOccurences.put(word, ransomOccurences.get(word) + 1);
        }

        for (String key : ransomOccurences.keySet()) {
            if (!magazineOccurences.containsKey(key)) {
                isPresent = false;
            }
            int needed = ransomOccurences.get(key);
            if (magazineOccurences.get(key) == null || magazineOccurences.get(key) < needed) {
                isPresent = false;
            }
        }
        if (isPresent) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
