public class Tasksheet122 {
    public static void main(String[] args) {
        Student student1 = new Student("Juan", "Dela Cruz");
        Student student2 = new Student("Diego", "Dimagiba");
        Student student3 = new Student("Pedro", "Penduko");

        student1.printFullName();
        student2.printFullName();
        student3.printFullName();
    }
}

class Student {
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName() {
        System.out.print(firstName + " ");
        System.out.println(lastName);

    }
}
