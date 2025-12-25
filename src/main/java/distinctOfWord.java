package Stream;

import java.util.Arrays;

public class distinctOfWord {
    public static void main(String[] arg){
        String s = "ababcdc";
        Arrays.stream(s.split(""))
                .distinct()
                .forEach(System.out::print);
    }
}
