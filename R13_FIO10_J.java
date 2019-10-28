import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.DataInputStream;
/**
 * FIO10-J. Ensure the array is filled when using read() to fill an array
 * Read methos can stop reading data before array is filled:
 *  Arises when we don't ensure array is filled
 * Prevention:
 *  Check return value of read() and handle case of array only being partially filled
 */
public class R13_FIO10_J {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        DataOutputStream outStream = new DataOutputStream(new FileOutputStream("rule13file.txt"));
        // Write sample value to file
        outStream.writeBytes("Hello World!");

        outStream.close();
        
        FileInputStream inStream = new FileInputStream("rule13File.txt");
        System.out.println("Contents of file13: " + readBytes(inStream));
        inStream.close();
    }

    // Expecting IOException or EOFException
    public static String readBytes(FileInputStream fis) throws IOException {
        byte[] data = new byte[1024];
        DataInputStream dis = new DataInputStream(fis);
        dis.readFully(data);
        String str = new String(data, "UTF-8");
        return str;
    }
}