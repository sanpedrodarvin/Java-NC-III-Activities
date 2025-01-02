import java.util.Scanner;

public class  Tasksheet116 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        StringBuilder reverseWord = new StringBuilder();

        System.out.print("Enter a word: ");
        word = in.next();

        for(int e = word.length(); e > 0; e-- )
            reverseWord.append(word.charAt(e-1));

        if(word.equalsIgnoreCase(reverseWord.toString()))
            System.out.println("The input string is a palindrome.");
        else
            System.out.println("The input string is not a palindrome.");


    }
}
