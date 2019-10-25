import java.math.BigInteger;

/**
 * STR03-J. Do not encode noncharacter data as a string
 * Unspecified behavior and losing data:
 *  Arises when we encode noncharacter data as a string
 * Prevention:
 *  Don't encode noncharacter data as a string
 */
public class rule04 {
    public static void main(String args[]) {
        BigInteger bigInt = new BigInteger("333333333333");
        // Non-compliant code would conver to byte array then string then back to byte array
        String strA = bigInt.toString();
        byte[] byteArr = strA.getBytes();
        String strB = new String(byteArr);
        bigInt = new BigInteger(strB);
    }
}