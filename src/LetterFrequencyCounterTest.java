import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class LetterFrequencyCounterTest {

    @org.junit.jupiter.api.Test

        public void testCountLetterFrequenciesAllLetters() {
            LetterFrequencyCounter lfc = new LetterFrequencyCounter();
            String input = "abcdefg";

            Map<Character, Integer> expectedFrequencies = new HashMap<>();
            expectedFrequencies.put('a', 1);
            expectedFrequencies.put('b', 1);
            expectedFrequencies.put('c', 1);
            expectedFrequencies.put('d', 1);
            expectedFrequencies.put('e', 1);
            expectedFrequencies.put('f', 1);
            expectedFrequencies.put('g', 1);

            // Get actual output from the method
            Map<Character, Integer> actualFrequencies = lfc.countLetterFrequenciesFromString(input);

            // Assert the two maps are equal
            assertEquals(expectedFrequencies, actualFrequencies);

        }



}