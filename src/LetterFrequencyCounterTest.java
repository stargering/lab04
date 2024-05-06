import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class LetterFrequencyCounterTest {

    @org.junit.jupiter.api.Test

        public void testCountLetterFrequenciesAllLetters() {
            String input = "abcdefghijklmnopqrstuvwxyz";
            Map<Character, Integer> frequencies = LetterFrequencyCounter.countLetterFrequenciesFromString(input);
            for (char c = 'a'; c <= 'z'; c++) {
                assertEquals("Frequency of " + c + " should be 1.", Integer.valueOf(1), frequencies.get(c));
            }
        }



    @org.junit.jupiter.api.Test
    void displayLetterFrequencies() {
    }

    @org.junit.jupiter.api.Test
    void findMostFrequentCharacter() {
    }
}