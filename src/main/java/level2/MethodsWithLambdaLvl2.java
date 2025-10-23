package level2;

import java.util.List;
import java.util.stream.Collectors;

class MethodsWithLambdaLvl2 {

    public static List<String> filterStringsStartsAwithLength3(List<String> list) {
        return list.stream().filter(s -> s.startsWith("A") && s.length() == 3).toList();
    }

    public static String intListToCommaSeparatedString(List<Integer> list) {
        return list.stream()
                .map(i -> (i % 2 == 0 ? "e" : "o") + i)
                .collect(Collectors.joining(", "));
    }


}
