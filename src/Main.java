import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException {
        CreateFile createFile = new CreateFile("ANewTextFile.txt");
        CreateFile createFile1 = new CreateFile("Integer.txt");
        CreateFile bigFile = new CreateFile("bigFile.txt");
        CharacterReader reader = new CharacterReader("ANewTextFile.txt");
        LetterFrequencyCounter counter = new LetterFrequencyCounter();



        WriteFile writer = new WriteFile("ANewTextFile.txt");
        writer.addString("the fox jumps over the lazy dog");

        WriteFile intwriter = new WriteFile("Integer.txt");
        intwriter.addInt(500);



        Map<Character, Integer> frequencyMap = counter.countLetterFrequencies("bigFile.txt");
        counter.displayLetterFrequencies(frequencyMap);
        System.out.println("The letter with the highest frequency is:" + " " + counter.findMostFrequentCharacter(frequencyMap));
        LetterFrequencyCounter.writeHistogram(frequencyMap);

    }





}
