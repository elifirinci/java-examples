import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter data: ");
        String data = input.nextLine();
        input.close();

        try {
            File file = new File("C:/Users/ELİF/OneDrive/Masaüstü/lab4/filehandling.txt");

            FileWriter myWriter = new FileWriter(file);
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully written.");

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String fileData = myReader.nextLine();
                System.out.println(fileData);
            }
            myReader.close();

            if (file.exists()) {
                System.out.println("File Name: " + file.getName());
                System.out.println("Absolute Path: " + file.getAbsolutePath());
                System.out.println("Size: " + file.length() + " bytes");
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Is File: " + file.isFile());
            } else {
                System.out.println("File does not exist.");
            }

            file.delete();
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
