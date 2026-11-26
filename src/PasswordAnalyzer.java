
import java.util.Scanner;

public class PasswordAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Password Strength Analyzer");
        System.out.print("Enter a password: ");

        String password = input.nextLine();

        System.out.println("Password entered successfully.");
    }
}
