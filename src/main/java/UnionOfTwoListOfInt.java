import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionOfTwoListOfInt {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {6,7,8,9};

        List<Integer> ans1 = Arrays.asList(1,2,3,4,5);
        List<Integer> ans2 = Arrays.asList(6,7,8,9);

        List<Integer> ans = Stream.concat(ans1.stream(),ans2.stream()).collect(Collectors.toList());
        System.out.println(ans);
    }
}
