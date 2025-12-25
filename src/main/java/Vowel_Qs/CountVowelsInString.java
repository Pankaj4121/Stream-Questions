package Vowel_Qs;

public class CountVowelsInString {
    public static void main(String[] args) {
        String s = "DeveloperUSA";
        long count = s.chars()
                .filter(c -> "aeiuoAEIOU".indexOf(c) != -1)
                .count();
        System.out.println(count);
    }
}
