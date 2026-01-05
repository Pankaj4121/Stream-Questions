import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZerosToLeft {
    public static void main(String[] args) {
        int[] arr = {3,6,0,4,2,0,0};

        //Option 1
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> zero = list.stream().filter(x -> x == 0).toList();
        List<Integer> nonzero = list.stream().filter(x -> x != 0).toList();

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(zero);
        finalList.addAll(nonzero);
        System.out.println(finalList);

        //Option 2
        List<Integer> ans = list.stream().collect(Collectors.partitioningBy(x -> x != 0)).values().stream()
                .flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(ans);


    }
}
