package Vowel_Qs;

import java.util.List;

public class firstWordContainingVowel {
    public static void main(String[] args) {
        List<String> words = List.of("sky", "java", "apple", "fly");
        String ans = words.stream()
                .filter(w -> w.matches(".*[aeiouAEIOU].*"))
                .findFirst()
                .orElse("No Found");
        System.out.println(ans);
    }
}
