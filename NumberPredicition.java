import java.util.Random;
import java.util.Scanner;
public class NumberPrediction{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        int number=random.nextInt(21);
        System.out.println("Enter a number 0 to 20: ");
        do{
            int number2=scanner.nextInt();
            if(number==number2){
            System.out.println("Correct estimation");
            break;
        }
            else if(number<number2){
                System.out.println("You should enter smaller number");
                
            }
            else{
                System.out.println("You should enter greater number");
                
            } 
        }while(true);
            
        
    }
}
