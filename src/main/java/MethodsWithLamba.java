import java.util.List;
import java.util.stream.Collectors;

class MethodsWithLamba {

    public static List<String> filterStringsWithO (List<String> list){
        return list.stream().filter(s->s.toLowerCase().contains("o")).toList();
    }

}
