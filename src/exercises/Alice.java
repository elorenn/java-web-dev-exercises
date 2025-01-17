package exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in " +
                "it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Which word should we search for? ");
        String searchTerm = input.nextLine();
        input.close();
        System.out.println(firstSentence.toLowerCase().contains(searchTerm.toLowerCase()));
        int index = firstSentence.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Index of " + searchTerm + ": " + index + ". Length of " + searchTerm + ": " + length);
        String modSentence = firstSentence.replace(searchTerm, " ");
        System.out.println(modSentence);
    }
}
