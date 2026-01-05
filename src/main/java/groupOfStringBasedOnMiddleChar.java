import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupOfStringBasedOnMiddleChar {
    public static void main(String[] args) {
        String[] str = {"wew", "jja", "pwe", "pja"};
        Map<String, List<String>> ans = Arrays.stream(str)
                .collect(Collectors.groupingBy(x -> x.toString().substring(1, 2)));
        System.out.println(ans);
    }
}
