import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class groupOfAnagram {
    public static void main(String[] args) {
        String[] arr = {"pat", "tap", "pan", "nap", "Team", "Tree"};
        List<String> list = Arrays.asList(arr);

        Collection<List<String>> ans = list.stream()
                .collect(Collectors.groupingBy(x -> Arrays.stream(x.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.toList()))).values();
        System.out.println(ans);
    }
}
