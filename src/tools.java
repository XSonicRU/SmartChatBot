import java.io.*;

class tools {
    static String filereader(FileInputStream reader) throws IOException {
        byte[] file = new byte[reader.available()];
        reader.read(file);
        String result = new String(tools.bytetochararray(file));
        return result;
    }
    static String readit() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    static String wordarraytostr(String[] arr){
        String result = arr[0];
        for(String a:arr){
            result = result + " " + a;
        }
        return result;
    }
    static String[] wordsarray(String input) {
        input = input.trim();
        int a = 0;
        for (int i = 0; i < input.length(); i++) {
            char buf = input.charAt(i);
            if (buf == ',' || buf == ' ') {
                if(buf == ','){
                    i++;
                }
                while (input.charAt(i) == ' '){
                    i++;
                }
                i--;
                a++;
            }
        }
        a++;
        String[] result = new String[a];
        int indexoflastfoundseparator = 0;
        a = 0;
        for (int i = 0; i < input.length(); i++) {
            char buf = input.charAt(i);
            if(buf == ','){
                result[a] = input.substring(indexoflastfoundseparator, i);
                a++;
                indexoflastfoundseparator = i;
                if(input.charAt(i+1) == ' '){
                    i++;
                    while (input.charAt(i) == ' '){
                        i++;
                    }
                    indexoflastfoundseparator = i;
                }
            }
            if (buf == ' ') {
                result[a] = input.substring(indexoflastfoundseparator, i);
                a++;
                while (input.charAt(i) == ' '){
                    i++;
                }
                indexoflastfoundseparator = i;
            }
        }
        result[result.length - 1] = input.substring(indexoflastfoundseparator);
        return result;
    }

    static char[] bytetochararray(byte[] array) {
        char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = (char) array[i];
        }
        return result;
    }
}
