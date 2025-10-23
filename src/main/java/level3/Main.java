package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Main {

    public static void main(String[] args) {

        Student std1, std2, std3, std4, std5, std6, std7, std8, std9, std10;
        std1 = new Student("Tron", 25, "JAVA", 8.9);
        std2 = new Student("Abel", 18, "PHP", 7.5);
        std3 = new Student("Andrea", 35, "JAVA", 5.2);
        std4 = new Student("Yisus", 30, "JAVA", 9.9);
        std5 = new Student("Fernando", 58, "PHP", 8.8);
        std6 = new Student("Hector", 16, "JAVA", 4.5);
        std7 = new Student("Jose", 18, "CIBERSEGURIDAD", 4.8);
        std8 = new Student("Joan", 32, "JAVA", 5);
        std9 = new Student("Almudena", 89, "PHP", 8);
        std10 = new Student("Patricia", 39, "CIBERSEGURIDAD", 6.7);

        List<Student> studenstList = new ArrayList<>(Arrays.asList(std1, std2, std3, std4, std5, std6, std7, std8, std9, std10));

        System.out.println("Students name and Age:");
        studenstList.forEach(s -> System.out.println(s.getName() + " " + s.getAge()));
        System.out.println("");

        System.out.println("Students their names start with an A:");
        List<Student> newStudentsList;
        newStudentsList = studenstList.stream().filter(s -> s.getName().matches("^[aàáAÀÁ].*")).toList();
        newStudentsList.forEach(s -> System.out.println(s.toString()));
        System.out.println("");

        System.out.println("Students with a grade of 5 or more.");
        studenstList.stream().filter(s -> s.getGrades() >= 5).forEach(System.out::println);
        System.out.println("");

        System.out.println("Students with a grade of 5 or more that do not study PHP:");
        studenstList.stream().filter(s -> s.getGrades() >= 5).filter(s -> !Objects.equals(s.getCourse(), "PHP")).forEach(System.out::println);
        System.out.println("");

        System.out.println("Students with 18 yo or more that Study Java:");
        studenstList.stream().filter(s -> Objects.equals(s.getCourse(), "JAVA")).filter(s -> s.getAge() >= 18).forEach(System.out::println);


    }

}
