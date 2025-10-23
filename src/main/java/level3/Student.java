package level3;

class Student {

    private final String name;
    private final String course;
    private final double grades;
    private final int age;

    public Student(String name, int age, String course, double grades) {

        this.name = name;
        this.age = age;
        this.course = course;
        this.grades = grades;

    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getGrades() {
        return grades;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return name + " - " + age + " years old - Coursing: " + course + " with a current grade of: " + grades;
    }

}
