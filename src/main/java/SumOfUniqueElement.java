import java.util.Arrays;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,4,5};
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);
    }
}
