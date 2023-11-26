import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Enter words: \n");
        Scanner text = new Scanner(System.in);
        while (text.hasNext())
            System.out.println("You entered: \n" + text.next());
        text.close();
    }
}