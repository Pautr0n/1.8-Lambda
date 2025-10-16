package level2;

import java.util.List;

class MethodsWithLambdaLvl2 {

    public static List<String> filterStringsStartsAwithLength3 (List<String> list){
        return list.stream().filter(s->s.startsWith("A") && s.length()==3).toList();
    }


}
