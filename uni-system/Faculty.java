
import java.util.Scanner;

public class Faculty {
    void determineDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department code (CEN/SEN/others):");
        String departmentCode = scanner.nextLine();

        switch (departmentCode) {
            case "CEN":
                System.out.println("You are directed to the Department of Computer Engineering");
                break;
            case "SEN":
                System.out.println("You are directed to the Department of Software Engineering");
                break;
            default:
                System.out.println("You are directed to the Faculty Secretariat");
                break;
        }
        scanner.close();
    }
}
