import java.util.Arrays;
import java.util.List;

public class KthSmallestInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,8,3,1,2,4,5);
        int k = 3;
        int ans = list.stream().sorted().skip(k - 1).findFirst().orElse(0);
        System.out.println(ans);
    }
}
