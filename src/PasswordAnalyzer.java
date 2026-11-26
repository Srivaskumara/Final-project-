
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

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSymbol = false;

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

        String lowerPassword = password.toLowerCase();

        boolean hasCommonPattern = false;

        if (lowerPassword.contains("password") ||
                lowerPassword.contains("1234") ||
                lowerPassword.contains("qwerty") ||
                lowerPassword.contains("abcd")) {
            hasCommonPattern = true;
        }

        if (hasCommonPattern) {
            System.out.println("Password contains a common pattern.");
        } else {
            System.out.println("No common patterns found.");
        }
    }
}
