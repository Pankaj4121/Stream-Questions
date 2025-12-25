package Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqencyOfWord {
    public static void main(String[] args) {
        String str = "Finding Frequecy of of Word";
        Map<String, Long> map = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        // .collect(Collectors.groupingBy(word -> word,Collectors.counting()));
        System.out.println(map);
    }
}
