import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> booleans = new ArrayList<>();
        int cases = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < cases; i++) {
            String s1 = bufferedReader.readLine();
            String s2 = bufferedReader.readLine();
            boolean contains = false;
            char[] charsString2 = s2.toCharArray();
            for (int j = 0; j < charsString2.length; j++) {
                char current = charsString2[j];
                if (s1.indexOf(current) >= 0){
                    contains = true;
                    break;
                }
            }
            if (contains) {
                booleans.add("YES");
            } else {
                booleans.add("NO");
            }
        }
        booleans.forEach(System.out::println);
    }
}
