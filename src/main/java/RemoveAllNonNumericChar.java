import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveAllNonNumericChar {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sn2f3f", "56fv80", "kl5d07");
        Pattern pattern = Pattern.compile("[^0-9]");
        List<String> ans = list.stream()
                .map(x -> pattern.matcher(x).replaceAll(""))
                .toList();
        System.out.println(ans);

    }
}
