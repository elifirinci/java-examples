import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandling {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        try{
            File file=new File("file.txt");
            BufferedWriter buffer=new BufferedWriter(new FileWriter(file,true));
            String text=scanner.nextLine();
            buffer.write(text);
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String data=reader.nextLine();
                System.out.println(data);
            }

            buffer.close();
            scanner.close();
            

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
    
}
