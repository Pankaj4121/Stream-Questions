import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "Hello World";
        int firstOcc = s.indexOf('H');
        int lastOcc = s.lastIndexOf('H');
        String ans = Arrays.stream(s.split(""))
                .filter(c-> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst()
                .get();
        System.out.println(firstOcc + " " + lastOcc);
        System.out.println(ans);

        //Another way
        Map<Character, Long> Charmap = s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(Charmap);

        char finalAns = Charmap.entrySet().stream().filter(c->c.getValue()==1)
                .map(m->m.getKey()).findFirst().get();
        System.out.println(finalAns);
    }
}
