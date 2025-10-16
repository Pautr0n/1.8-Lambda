package level1;

import java.util.List;


class MethodsWithLamba {

    public static List<String> filterStringsWithO (List<String> list){
        return list.stream().filter(s->s.toLowerCase().contains("o")).toList();
    }

    public static List<String> filterStringsWithOandLength5 (List<String> list){
        return list.stream().filter(s->s.contains("o") || s.contains("O") && s.length()==5).toList();
    }


}
