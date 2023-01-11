package exercises;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}

