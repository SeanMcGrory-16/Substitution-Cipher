import java.util.HashMap;
import java.util.Map;

public class LetterFrequencyAnalyzer {

    public static void main(String[] args) {
        // Obtain the corpus text from CorpusImporter
        String corpusText = CorpusImporter.getCorpusText();

        // Encrypt the original message
        Map<Character, Character> keyMap = Key_Generator.generateCipherKey();
        String encryptedMessage = Encryptor.encrypt(corpusText, keyMap);
        System.out.println("Encrypted Message: " + encryptedMessage);

        // Analyze the letter frequency on the corpus text
        Map<Character, Double> corpusFrequencyMap = analyzeLetterFrequency(corpusText, "Original Corpus");

        // Analyze the letter frequency on the encrypted message
        Map<Character, Double> encryptedFrequencyMap = analyzeLetterFrequency(encryptedMessage, "Encrypted Corpus");

        // Compare letter frequencies and print the results
        compareFrequencies(corpusFrequencyMap, encryptedFrequencyMap);
    }

    public static Map<Character, Double> analyzeLetterFrequency(String text, String label) {
        Map<Character, Double> frequencyMap = new HashMap<>();

        // Converts the text to lowercase to make the analysis case-insensitive
        text = text.toLowerCase();

        // Count the occurrences of each letter
        int totalLetters = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0.0) + 1.0);
                totalLetters++;
            }
        }

        // Calculate frequencies as percentages
        for (Map.Entry<Character, Double> entry : frequencyMap.entrySet()) {
            char letter = entry.getKey();
            double count = entry.getValue();
            double frequency = count / totalLetters * 100.0;
            frequencyMap.put(letter, frequency);
        }

        // Print the analysis results
        System.out.println(label + " Letter Frequency Analysis:");
        for (char letter : frequencyMap.keySet()) {
            double frequency = frequencyMap.get(letter);
            String formattedFrequency = String.format("%.5f", frequency);
            System.out.println(letter + ": " + formattedFrequency + "%");
        }

        return frequencyMap;
    }

    public static void compareFrequencies(Map<Character, Double> corpusMap, Map<Character, Double> encryptedMap) {
        System.out.println("Letter Frequency Comparison:");
        for (char letter : corpusMap.keySet()) {
            double corpusFrequency = corpusMap.get(letter);
            double encryptedFrequency = encryptedMap.getOrDefault(letter, 0.0);

            String formattedCorpusFrequency = String.format("%.5f", corpusFrequency);
            String formattedEncryptedFrequency = String.format("%.5f", encryptedFrequency);

            System.out.println(letter + ": Corpus - " + formattedCorpusFrequency + "%, Encrypted - " + formattedEncryptedFrequency + "%");
        }
    }
}
