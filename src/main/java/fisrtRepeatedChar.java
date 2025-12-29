import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fisrtRepeatedChar {
    public static void main(String[] args) {
        String s = "Hello World";

        Map<Character, Long> charMap = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        System.out.println(charMap);

        char ans = charMap.entrySet().stream()
                .filter(m-> m.getValue() > 1)
                .map(m -> m.getKey())
                .findFirst()
                .get();
        System.out.println(ans);
    }
}
