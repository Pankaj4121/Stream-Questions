package Vowel_Qs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountVowelsInEachWord {
    public static void main(String[] args) {
        List<String> words = List.of("sky", "java", "apple", "fly");
        Map<String, Long> map = words.stream()
                .collect(Collectors.toMap(
                        w -> w,
                        w -> w.chars()
                                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                                .count()
                ));
        System.out.println(map);
    }
}
