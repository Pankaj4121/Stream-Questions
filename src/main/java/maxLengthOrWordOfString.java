package Stream;

import java.util.Arrays;
import java.util.Comparator;

public class maxLengthOrWordOfString {
    public static void main(String[] args){
        String s = "This is my first Stream Code";
        String maxWord = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(maxWord);

        int maxLength = Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println(maxLength);
    }

}
