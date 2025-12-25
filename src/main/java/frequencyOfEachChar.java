import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfEachChar {
    public static void main(String[] args) {
        String s = "Missisisppi";
        Map<String, Long> freq = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(freq);
    }
}
