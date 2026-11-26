
import java.util.Scanner;

public class PasswordAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Password Strength Analyzer");
        System.out.print("Enter a password: ");

        String password = input.nextLine();


        System.out.println("Password length: " + password.length());

        if (password.length() >= 8) {
            System.out.println("Password meets the minimum length.");
        } else {
            System.out.println("Password is too short.");
        }

    }
}
