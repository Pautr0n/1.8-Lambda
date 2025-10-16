import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static void main(String[] args) {

        IO.println("Demonstrating Exercise 1:\n");
        List<String> originalList = new ArrayList<>();
        originalList.add("Rotulador");
        originalList.add("Tungsteno");
        originalList.add("Zarzaparrilla");
        originalList.add("Transfuncionador del continuo");
        originalList.add("Ni cintieni la i");
        originalList.add("Tonto");

        IO.println("Printing original List.");
        originalList.forEach(IO::println);
        IO.println("");
        IO.println("Printing a list with strings that has the letter 'o':");

        List<String> filteredList = new ArrayList<>();
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




    }



}
