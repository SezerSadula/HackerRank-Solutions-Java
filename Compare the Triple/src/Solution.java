import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> integerList = new ArrayList<>();
        int firstList = 0;
        int secondList = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < b.size(); j++) {
                int current1 = a.get(i);
                int current2 = b.get(j);

                if ((current1 > b.get(j)) && ((current1 <= 100) && (current1 >= 1))
                        && ((current2 <= 100) && (current2 >= 1))) {

                    firstList += 1;
                    break;

                } else if ((current1 < current2)
                        && ((current1 <= 100) && (current1 >= 1))
                        && ((current2 <= 100) && (current2 >= 1))) {

                    secondList += 1;

                    break;
                } else if (current1 == current2) {
                    break;
                }
            }
        }

        integerList.add(firstList);
        integerList.add(secondList);

        return integerList;
    }


    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
