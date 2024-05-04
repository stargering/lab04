import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        CreateFile createFile = new CreateFile("ANewTextFile.txt");
        WriteFile writer = new WriteFile("ANewTextFile.txt");
        writer.addString("ok buzz");
        getNextCharacter("ANewTextFile.txt");
    }

    public static char getNextCharacter(String filePath) {
        int nextChar = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((nextChar = reader.read()) != -1) {
               
                if (nextChar == '\r') {
                    continue;
                }
                System.out.print((char) nextChar);
            }
        } catch (IOException e) {
            System.out.println("There is an error in reading file");
            e.printStackTrace();
        }
        return (char)nextChar;
    }





}
