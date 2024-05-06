import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

    public class LetterFrequencyCounter {

        // Read a file and count the frequency of each letter
        public static Map<Character, Integer> countLetterFrequencies(String filePath) {
            Map<Character, Integer> letterFrequencies = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                int data;
                while ((data = reader.read()) != -1) {
                    char character = Character.toLowerCase((char) data);

                    if (character >= 'a' && character <= 'z') {
                        letterFrequencies.put(character, letterFrequencies.getOrDefault(character, 0) + 1);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }

            return letterFrequencies;
        }
        public static void displayLetterFrequencies(Map<Character, Integer> letterFrequencies) {
            System.out.println("Letter frequencies:");
            for (Map.Entry<Character, Integer> entry : letterFrequencies.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public static Character findMostFrequentCharacter(Map<Character, Integer> letterFrequencies) {

            Character mostFrequent = null;
            int highestFrequency = 0;

            for (Map.Entry<Character, Integer> entry : letterFrequencies.entrySet()) {
                if (entry.getValue() > highestFrequency) {
                    highestFrequency = entry.getValue();
                    mostFrequent = entry.getKey(); // Update the most frequent character
                }
            }

            return mostFrequent;
        }

        public static String generateStars(int count){
            StringBuilder stars = new StringBuilder();
            for (int i = 0; i < count; i++) {
                stars.append('*');
            }
            return stars.toString();
        }

        public static void writeHistogram (Map<Character, Integer> letterFrequencies){
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    System.out.println((ch + " : " + generateStars((letterFrequencies.getOrDefault(Character.toLowerCase(ch),
                            0))) + "\n"));
                }
        }
    }

