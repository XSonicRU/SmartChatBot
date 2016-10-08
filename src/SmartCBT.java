import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SmartCBT {
    File f = new File(new File(".").getAbsolutePath() + "CBTdata.txt");
    FileInputStream reader;
    FileOutputStream writer;

    public SmartCBT() throws IOException {
        if (!f.exists()) {
            if (f.createNewFile()) {
                System.out.println("CBT's data is not exist. It was created, but CBT does nothing now.");
                System.out.println("You need to teach CBT.");
            } else {
                System.out.println("Error in createNewFile function.");
            }
            reader = new FileInputStream(f);
            writer = new FileOutputStream(f);
        }
    }

    public String run(String input) throws IOException {
        byte[] file = new byte[reader.available()];
        reader.read(file);
        String sfile = new String(tools.bytetochararray(file));
        return null;
    }
}
