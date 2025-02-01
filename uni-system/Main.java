import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student surname:");
        String surname = scanner.nextLine();

        Student student = new Student();
        student.assignValues(studentId, name, surname);

        System.out.println("\nStudent Information:");
        student.displayInfo();

        Faculty faculty = new Faculty();
        faculty.determineDepartment();

        scanner.close();
    }
}

