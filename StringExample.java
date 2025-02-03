import java.util.Scanner;
public class StringExercise{
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=scanner.nextLine();
        System.out.println("Uppercase: "+sentence.toUpperCase());
        System.out.println("Lowercase: "+sentence.toLowerCase());
        System.out.println("5.indexteki karakter: "+sentence.charAt(5));
        System.out.println("Substring: "+sentence.substring(8,10));
        System.out.println("Trim: "+sentence.trim());
        System.out.println("Sentence length: "+sentence.length());
        System.out.println("e harfi nerede: "+sentence.indexOf("e"));
        System.out.println("e harfi sondan nerede: "+sentence.lastIndexOf("e"));
        String[] characters;
        characters=sentence.split("");
        for(String words:characters){
            System.out.println(words);
        }



        System.out.println("Enter second sentence");
        String sentence2=scanner.nextLine();
        System.out.println("Sentence1+sentence2: "+sentence.concat(sentence2))
        System.out.println("Sentence1=?sentence2: "+sentence.equals(sentence2));;

        scanner.close();



    }
}
