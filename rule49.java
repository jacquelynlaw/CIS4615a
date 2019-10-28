import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
/**
 * MSC02-J. Generate strong random numbers
 * Psuedorandom number generators do not achive true randomness:
 *  Arises when we use java.util.Random (a PRNG)
 *  Attacker can learn value of seed value
 * Prevention:
 *  Use a more secure random number generator like java.security.SecureRandom
 */
public class rule49 {
    public static void main(String args[]) {
        try {
            SecureRandom number = SecureRandom.getInstanceStrong();
            // Generate 5 random integers between 0..100
            for (int i = 0; i < 5; i++) {
                System.out.println(number.nextInt(101));
            }
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e);
        }
    }
}