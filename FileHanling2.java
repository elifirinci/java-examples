import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;;
public class filee {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            File file=new File("C:/Users/ELİF/OneDrive/Masaüstü/filee.txt");
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File doesn't exist");    
            }
            BufferedWriter buffer=new BufferedWriter(new FileWriter(file,true));
            String data=scanner.nextLine();
            while(!data.equals("exit")){
                buffer.write(data);
                buffer.newLine();
                data=scanner.nextLine();
            }
            buffer.close();
            System.out.println("*************************************\n");
            System.out.println("Dosya İçeriği");

            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String filedata=reader.nextLine();
                System.out.println(filedata);
            }
            scanner.close();
            System.out.println("Dosya Bilgileri");
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Is File: " + file.isFile());


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
             
		
	}
}

