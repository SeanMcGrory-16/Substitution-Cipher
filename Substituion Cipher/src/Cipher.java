import java.util.Map;

public class Cipher {

    public static void main(String[] args) {
        // Generate a cipher key
        Map<Character, Character> keyMap = Key_Generator.generateCipherKey();
        System.out.println("Generated Cipher Key: " + keyMap);

        // Obtain the corpus text from CorpusImporter
        String corpusText = CorpusImporter.getCorpusText();

        // Encrypt the corpus text
        String encryptedMessage = Encryptor.encrypt(corpusText, keyMap);

        // Decrypt the encrypted message
        String decryptedMessage = Decryptor.decrypt(encryptedMessage, keyMap);

        // Analyze the letter frequency on the corpus text
        Map<Character, Double> corpusFrequencyMap = LetterFrequencyAnalyzer.analyzeLetterFrequency(corpusText, "Original Corpus");

        // Analyze the letter frequency on the encrypted message
        Map<Character, Double> encryptedFrequencyMap = LetterFrequencyAnalyzer.analyzeLetterFrequency(encryptedMessage, "Encrypted Corpus");

        // Compare letter frequencies and print the results
        LetterFrequencyAnalyzer.compareFrequencies(corpusFrequencyMap, encryptedFrequencyMap);
    }
}
