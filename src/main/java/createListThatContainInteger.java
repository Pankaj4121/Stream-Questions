import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class createListThatContainInteger {
    public static void main(String[] args) {
         String[] s = {"abc", "KBC", "123", "567"};

        List<Integer> list = Arrays.stream(s)
                .filter(x -> x.matches("[0-9]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
