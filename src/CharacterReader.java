import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterReader {
    String filePath;

    public CharacterReader(String filePath) {
        this.filePath = filePath;
    }


    public char getNextCharacter() {
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
        return (char) nextChar;
    }
}
