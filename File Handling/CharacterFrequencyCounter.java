import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();

        try (FileReader fileReader = new FileReader("input.txt")) {
            int characterCode;
            while ((characterCode = fileReader.read()) != -1) {
                char character = (char) characterCode;
                characterFrequencyMap.put(
                    character,
                    characterFrequencyMap.getOrDefault(character, 0) + 1
                );
            }
        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        }

        for (Map.Entry<Character, Integer> entry : characterFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
