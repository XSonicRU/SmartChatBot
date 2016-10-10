import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class SmartCBT {
    private FileInputStream reader;
    private FileOutputStream writer;

    SmartCBT() throws IOException {
        File f = new File(new File(".").getAbsolutePath() + "CBTdata.txt");
        if (!f.exists()) {
            if (f.createNewFile()) {
                if(main.language){
                    System.out.println("База данных бота не существует. Она была создана, но он сейчас не умеет ничего.");
                    System.out.println("Твоя задача - обучить его.");
                }else{
                    System.out.println("CBT's data is not exist. It was created, but CBT does nothing now.");
                    System.out.println("You need to teach CBT.");
                }

            } else {
                System.out.println("Error in createNewFile function.");
            }
            reader = new FileInputStream(f);
            writer = new FileOutputStream(f);
        }
    }

    String run(String input) throws IOException {
        input = input.trim();
        byte[] rawfile = new byte[reader.available()];

        String sfile = tools.filereader(reader);
        String tocheck = tools.wordarraytostr(tools.wordsarray(input));
        if(sfile.contains(tocheck)){
            sfile.indexOf(tocheck);
        }else{
            if(main.language){
                System.out.println("Я тебя не понимаю...");
                System.out.println("Пожалуйста, объясни мне что ты имеешь ввиду и я отвечу тебе также как и ты в следующий раз.");
            }else{
                System.out.println("I don't understand you...");
                System.out.println("Please, explain me what you mean. And i'll answer like you in the next time.");
            }

            String ninput = tools.readit();

        }
        return null;
    }
}
