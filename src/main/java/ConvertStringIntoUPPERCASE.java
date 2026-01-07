import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringIntoUPPERCASE {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jay Shree Ram","Jay Hanuman");
        List<String> ans = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ans);
    }
}
