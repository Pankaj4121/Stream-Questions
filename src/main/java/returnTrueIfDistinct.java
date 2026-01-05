import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class returnTrueIfDistinct {
    public static void main(String[] args) {
        int[] arr = {2,0,4,7,0};
        List<Integer> list = Arrays.stream(arr).boxed().toList();

        Map<Integer,Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        boolean ans = map.entrySet().stream().noneMatch(x -> x.getValue() >   0);
        System.out.println(ans);
    }
}
