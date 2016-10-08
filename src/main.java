import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main {
    private static String readit() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
    public static void main(String[] args) throws IOException {
        String input;
        SmartCBT scbt = new SmartCBT();
        while (true){
            input = readit();
            System.out.println(scbt.run(input));
        }
    }
}
