import java.util.Scanner;
import java.lang.Object;
import java.util.regex.Patter;
/**
 * Log injection vulnerability:
 *  Arises when log entry contains unsanitized user input
 * Prevention:
 *  Sanitizing and validating untrusted input
 */
public class rule00 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String username;

        // Prompt user for a username
        System.out.print("Enter username: ");
        username = sc.nextLine();

        System.out.println("Login successful for " + sanitizeUser(username));
        sc.close();
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
}