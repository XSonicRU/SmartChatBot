import java.io.*;
import java.util.Arrays;

public class main {
    static boolean language = false; //false - eng. true - rus
    public static void main(String[] args) throws IOException {
        if(new File(new File("").getAbsolutePath()+"lang.txt").exists()){
            if(tools.filereader(new FileInputStream(new File(new File("").getAbsolutePath()+"lang.txt"))).equalsIgnoreCase("rus")){
                language = true;
            }else{
                language = false;
            }
        }else{
            if(!new File(new File("").getAbsolutePath()+"lang.txt").createNewFile()){
                System.out.println("ERROR!");
            }
        }
        String input;
        SmartCBT scbt = new SmartCBT();
        while (true){
            input = tools.readit();
            System.out.println(scbt.run(input));
        }
    }
}
