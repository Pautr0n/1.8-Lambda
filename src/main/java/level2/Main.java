package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    }

}
