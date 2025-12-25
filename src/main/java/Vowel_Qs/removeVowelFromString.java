package Vowel_Qs;

import java.util.stream.Collectors;

public class removeVowelFromString {
    public static void main(String[] args) {
        String str = "USADeveloper";
        String ans = str.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) == -1)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(ans);
    }
}
