import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestWord {
    public static void main(String[] args) {
        String str = "Now I am doingg Stream Questions";
        String secondHighest = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse("Not Found");
        System.out.println(secondHighest);

        //For Duplicate length exist
        String secondHighest2 = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream()
                .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
                .skip(1)
                .findFirst()
                .map(e -> e.getValue().get(0))
                .orElse("Not Found");
        System.out.println(secondHighest2);

    }
}
