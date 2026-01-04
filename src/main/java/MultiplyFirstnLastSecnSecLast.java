import java.util.stream.IntStream;

public class MultiplyFirstnLastSecnSecLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        IntStream.range(0, arr.length/2)
                .map(x-> arr[x] * arr[arr.length - x - 1])
                .forEach(System.out::println);
    }
}
