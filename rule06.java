/**
 * Incorrect results:
 *  Arises we use assertions to validate method arguments
 * Prevention:
 *  Check for illegal arguments
 */
public class rule06 {
    public static void main(String args[]) {
        // Add absolute values of integers
        // Case that passes
        System.out.println(getAbsAdd(1, 0));
        // Case that throws exception
        System.out.println(getAbsAdd(Integer.MAX_VALUE, 33333333));
    }

    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }

        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }

        return absX + absY;
    }
}