import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        List<Integer> list = Arrays.stream(arr).boxed().toList();

        List<List<Integer>> checkedList = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream()
                .map(x->x.getValue())
                .collect(Collectors.toList());
        System.out.println(checkedList);
    }
}
