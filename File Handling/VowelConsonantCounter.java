import java.io.FileReader;
import java.io.IOException;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        try (FileReader reader = new FileReader("input.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                char ch = Character.toLowerCase((char) character);
                if (ch >= 'a' && ch <= 'z') {
                    if ("aeiou".indexOf(ch) >= 0) {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
    }
}
