package Vowel_Qs;

import java.util.List;
import java.util.stream.*;

public class exatlyNVowels {
    public static void main(String[] args) {
        List<String> words = List.of("sky", "java", "apple", "fly");
        words.stream()
                .filter(w -> w.chars()
                        .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                        .count() == 2)
                .forEach(System.out::println);
    }
}
