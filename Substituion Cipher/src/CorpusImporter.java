import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CorpusImporter {

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "/Desktop";
        String corpusFilePath = desktopPath + "/corpus.rtf";

        try {
            String corpusText = readCorpusFromFile(corpusFilePath);
            System.out.println("Corpus Text: " + corpusText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCorpusText() {
        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "/Desktop";
        String corpusFilePath = desktopPath + "/corpus.rtf";

        try {
            return readCorpusFromFile(corpusFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String readCorpusFromFile(String filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }

        return stringBuilder.toString();
    }
}
