
import java.util.Scanner;

public class PasswordAnalyzer {
    public static void main(String[] args) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSymbol = false;
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


        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else {
                hasSymbol = true;
            }
        }

        System.out.println("Uppercase: " + hasUpper);
        System.out.println("Lowercase: " + hasLower);
        System.out.println("Numbers: " + hasNumber);
        System.out.println("Symbols: " + hasSymbol);




    }
}
