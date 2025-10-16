package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static void main(String[] args) {

        IO.println("Demonstrating Exercise 1:\n");
        List<String> originalList = new ArrayList<>(Arrays.asList("Rotulador","Tungsteno","Zarzaparrila",
                "Transfuncionador del continuo", "Ni cintieni la i","Tonto"));

        IO.println("Printing original List.");
        originalList.forEach(IO::println);
        IO.println("");
        IO.println("Printing a list with strings that has the letter 'o':");

        List<String> filteredList;
        filteredList = MethodsWithLamba.filterStringsWithO(originalList);
        filteredList.forEach(IO::println);

        IO.println("");
        IO.println("Demonstrating Exercise 2:");
        filteredList = MethodsWithLamba.filterStringsWithOandLength5(originalList);
        filteredList.forEach(IO::println);

        IO.println("");
        IO.println("Demonstrating Exercise 3:");

        List<String> months = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        months.forEach(s->IO.println(s));

        IO.println("");
        IO.println("Demonstrating Exercise 4:");
        months.forEach(IO::println);

        IO.println("");
        IO.println("Demonstrating Exercise 5:");
        FunctionalInterface fi = ()->3.1415;
        IO.println(fi.getPiValue());

        List<Object> list = new ArrayList<>();
        list.add("Troncoso");
        list.add(5.66);
        list.add("Hola");
        list.add(569855);
        list.add("ASdasdsadsadsadads");
        list.add(33433.356);

        IO.println("");
        IO.println("Demonstrating Exercise 6:");
        List<String> sortedList = list.stream()
                .map(Object::toString)
                .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .toList();
        sortedList.forEach(IO::println);

        IO.println("");
        IO.println("Demonstrating Exercise 7:");
        sortedList.reversed().forEach(IO::println);

        IO.println("");
        IO.println("Demonstrating Exercise 8:");

        ReversedString reversedString = (input) -> new StringBuilder(input).reverse().toString();
        IO.println(reversedString.reverseString("laMlataF"));

    }



}
