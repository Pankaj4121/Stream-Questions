import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class productOfFirstTwoElement {
    public static void main(String[] args) {
        int[] arr = {12,5,7,8,9};

        int res = Arrays.stream(arr).boxed().toList()
                .stream().limit(2)
                .reduce(1, (a,b)-> a*b);
        System.out.println(res);
    }
}
