package m;

import java.util.ArrayList;
import java.util.*;

import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello, world!");

        List<String> yeet = new ArrayList<>();
        yeet.add("1");
        // yeet.add("5");
        yeet.add("9");
        yeet.add("66");
        System.out.println(partialSum(yeet, 1, 60));
        // wordsOfLength(text, 2);

    }

    static List<String> wordsOfLength(String text, int wordLength) {
        List<String> b = new ArrayList<>(); // Arrays.stream(text.split(" ")).filter((s) -> s.length() == wordLength);
        return b;
    }

    public static int partialSum(List<String> strings, int min, int max) {

        IntStream b = strings.stream().mapToInt(x -> Integer.parseInt(x)) // got to filter(s -> isInt(s));
                .filter(s -> s > min && s < max);
        OptionalInt any = b.findAny();
        return any.getAsInt();
    }
}
