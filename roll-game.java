import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		Random random= new Random();
		System.out.println("Zar Atma Oyununa Hoş Geldiniz\n Büyük zar atan kazanır");
		System.out.println("Sıra sizde!");
		System.out.println("1'den 6'ya kadar olan bir sayı giriniz");
        int number1=scanner.nextInt();
		
		System.out.println("Sıra bilgisayarda!");
		scanner.nextLine();
		int number2=random.nextInt(6)+1;
	    System.out.println("Bilgisayarın sayısı: "+number2);
	    if(number1>number2){
	    		System.out.println("Siz kazandınız, tebrikler!");
	    }
	    else if(number1<number2){
	    		System.out.println("Bilgisayar kazandı... ");
	    }
		
	}
}
