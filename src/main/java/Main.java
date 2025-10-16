import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    static void main(String[] args) {

        IO.println("Demonstrating Exercise 1:\n");
        List<String> stringList = new ArrayList<>();
        stringList.add("Rotulador");
        stringList.add("Tungsteno");
        stringList.add("Zarzaparrilla");
        stringList.add("Transfuncionador del continuo");
        stringList.add("Ni cintieni la i");

        IO.println("Printing original List.");
        stringList.forEach(IO::println);
        IO.println("");
        IO.println("Printing a list with strings that has the letter 'o':");

        stringList = MethodsWithLamba.filterStringsWithO(stringList);
        stringList.forEach(IO::println);



    }



}
