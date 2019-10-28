import java.io.IOException;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
/**
 * NUM03-J. Use integer types that can fully represent the possible range of unsigned data
 * Use integer types that can fully represent possible range of unsigned data:
 *  Sign and magnitude data can be misinterpreted
 * Prevention:
 *  Require values read as 32-bit unsigned integers with a mask
 */
public class R03_NUM03_J {
    public static void main(String args[]) throws IOException {
        DataOutputStream outStream = new DataOutputStream(new FileOutputStream("rule03file.txt"));
        // Write sample value to file
        outStream.writeInt(53420);

        outStream.close();

        DataInputStream inStream = new DataInputStream(new FileInputStream("rule03file.txt"));

        long valueA = getInteger(inStream);
        System.out.println("53420 = " + valueA);

        inStream.close();
    }

    public static long getInteger(DataInput inStream) throws IOException {
        // Mask with 32 one-bits
        return inStream.readInt() & 0xFFFFFFFFL;
    }
}