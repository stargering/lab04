import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCharacterReader {
    private FileReader fileReader;

    public FileCharacterReader(String filePath){
        try {
            fileReader = new FileReader("colors.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int getNextCharacter() {
        int nextChar = 0;
        try {
            nextChar = fileReader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Ignore carriage return characters
        while (nextChar == '\r') {
            try {
                nextChar = fileReader.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return nextChar;
    }

    public void close(){
        try {
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
