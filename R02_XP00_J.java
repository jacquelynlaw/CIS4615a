import java.io.File;
import java.io.IOException;
/**
 * XP00-J.  Do  not  ignore  values  returned  by  methods
 * Ignoring method return values:
 *  Methods can return values to communicate failure or success
 * Prevention:
 *  Don't ignore method return values
 */
public class R02_XP00_J {
    public static void main(String args[]) {
        File randomFile = new File("randomFile.txt");

        try {
            if (randomFile.createNewFile()) {
                System.out.println("[randomFile.txt] successfully created!");
            } else {
                System.out.println("[randomFile.txt] already exists.");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        deleteFile(randomFile);
    }

    public static void deleteFile(File filename) {
        // Handle file deletion
        if (!filename.delete()) {
            try {
                if (!filename.exists()) {
                    System.out.println("[" + filename + "] doesn't exist.");
                }
                else if (filename.isDirectory() && filename.list().length > 0) {
                    System.out.println("[" + filename + "] is a directory and is not empty.");
                }
                else {
                    System.out.println("[" + filename + "] cannot be deleted for an indetermined reason.");
                }
            } catch (SecurityException e) {
                System.err.println(e);
            }
        } else {
            System.out.println("[" + filename + "] successfully deleted!");
        }
    }
}