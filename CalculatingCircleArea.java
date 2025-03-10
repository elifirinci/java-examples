import java.util.Scanner;
public class Main{
	static Scanner scanner=new Scanner(System.in);
	public static void calculate_field_circle(int number){
			double pi=3.14;
			double field=pi*Math.pow(number,2);
			System.out.println("Field is " + field);		
		}
	
	public static void main(String[] args) {
		System.out.println("Enter a radius: ");
		int number=scanner.nextInt();
		calculate_field_circle(number);	
	}
}
