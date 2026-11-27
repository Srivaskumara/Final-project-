
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

            } else if (!Character.isWhitespace(c)) {
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


        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (hasUpper) {
            score++;
        }

        if (hasLower) {
            score++;
        }

        if (hasNumber) {
            score++;
        }

        if (hasSymbol) {
            score++;
        }

        if (hasCommonPattern) {
            score -= 2;
        }

        if (score < 0) {
            score = 0;
        }

        System.out.println("Password score: " + score);

        if (score <= 2) {
            System.out.println("Password strength: Weak");
        } else if (score <= 4) {
            System.out.println("Password strength: Medium");
        } else {
            System.out.println("Password strength: Strong");
        }


        System.out.println("Suggestions:");


        if (password.length() >= 8 && hasUpper && hasLower &&
                hasNumber && hasSymbol && !hasCommonPattern) {
            System.out.println("- No improvements needed based on these checks.");
        }



        if (password.length() < 8) {
            System.out.println("- Make your password at least 8 characters long.");
        }

        if (!hasUpper) {
            System.out.println("- Add an uppercase letter.");
        }

        if (!hasLower) {
            System.out.println("- Add a lowercase letter.");
        }

        if (!hasNumber) {
            System.out.println("- Add a number.");
        }

        if (!hasSymbol) {
            System.out.println("- Add a symbol.");
        }

        if (hasCommonPattern) {
            System.out.println("- Avoid common patterns.");
        }


    }
}
