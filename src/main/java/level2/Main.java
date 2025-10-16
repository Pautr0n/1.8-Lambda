package level2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static void main(String[] args){

        IO.println("Demonstrating lvl 2 Exercise 1:");
        List<String> originalList = new ArrayList<>(Arrays.asList("Ala", "February", "As", "April", "May", "Ama", "Aro", "aro", "Alegría", "November", "December"));
        IO.println("Printing original List");
        IO.println(originalList);

        List<String> modifiedList = MethodsWithLambdaLvl2.filterStringsStartsAwithLength3(originalList);
        IO.println("Printing modified List with strings starting with capital A and with a length() of 3");
        IO.println(modifiedList);

        IO.println("");
        IO.println("Demonstrating Exercise 2:");

        IO.println(MethodsWithLambdaLvl2.intListToCommaSeparatedString(Arrays.asList(2,44,89,56,78,22,65,47,98,52,10,3698)));

        IO.println("");
        IO.println("Demonstrating Exercise 3:");

        FunctionalInterfaceOpearcio funcIntAdd = (a,b)-> a + b;
        FunctionalInterfaceOpearcio funcIntSubs = (a,b) -> a - b;
        FunctionalInterfaceOpearcio funcIntMult = (a,b) -> a * b;
        FunctionalInterfaceOpearcio funcIntDiv = (a,b) -> b != 0 ? a / b : Float.NaN;
        IO.println("Addition: 10 + 20 = " + funcIntAdd.operation(10f,20f));
        IO.println("Subsatraction: 10.5 + 80.02 = " + funcIntSubs.operation(10.5f,80.02f));
        IO.println("Product: 5 * 20 = " + funcIntMult.operation(5f,20f));
        IO.println("Division: 125 / 5 = " + funcIntDiv.operation(125f,5f));

        IO.println("");
        IO.println("Demonstrating Exercise 4:");

        List<String> stringAndNumbersList = new ArrayList<>(Arrays.asList("Leo","Elena","23","43","Ester","Roberto","45","Pablo","Rodrigo","Aitor","68"));
        IO.println(stringAndNumbersList);
        IO.println("");

        IO.println("Printing the list sorted alphabetically by the first character:");
        IO.println(stringAndNumbersList.stream().sorted(Comparator.comparingInt(s ->s.charAt(0))).collect(Collectors.toList()));
        IO.println("");

        IO.println("Printing the list with strings with an 'e' first:");
        IO.println(stringAndNumbersList.stream().sorted((ele1,ele2) ->{
            boolean ele1HasE = ele1.toLowerCase().contains("e");
            boolean ele2HasE = ele2.toLowerCase().contains("e");
            return Boolean.compare(!ele1HasE,!ele2HasE);
        }).collect(Collectors.toList()));
        IO.println("");

        IO.println("Printing the list shifting all the 'a' for '4':");
        IO.println(stringAndNumbersList.stream()
                .map(s->s.replaceAll("[aAÀÁ]","4"))
                .collect(Collectors.toList()));
        IO.println("");

        IO.println("Printing only the numbers within the list:");
        IO.println(stringAndNumbersList.stream().filter(s->s.matches("\\d+")).collect(Collectors.toList()));


    }

}
