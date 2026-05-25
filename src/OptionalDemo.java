import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // 1. Changed variable name to 'names' to match the stream below
        List<String> names = Arrays.asList("Nabin", "Rai");

        Optional<String> nameResult = names.stream()
                .filter(str -> str.contains("n"))
                .findFirst();

        System.out.println(nameResult.orElse("Not Found"));

    } // 2. Fixed the trailing comma error here
}