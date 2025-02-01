
public class Student{
    int studentId;
    String name;
    String surname;

    void assignValues(int id, String name, String surname) {
        this.studentId = id;
        this.name = name;
        this.surname = surname;
    }

    void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }

}