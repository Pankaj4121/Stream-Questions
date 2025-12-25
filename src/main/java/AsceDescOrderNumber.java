import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AsceDescOrderNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Arrays.stream(arr)
                .mapToObj(x->x)
                .sorted()
                .forEach(System.out::print);

        System.out.println();

        Arrays.stream(arr)
                .mapToObj(x -> x)
                .sorted(Collections.reverseOrder())
                .forEach(System.out::print);
    }
}
