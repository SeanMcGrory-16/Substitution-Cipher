import java.util.Map;
import java.util.HashMap;
public class Decryptor {

		    public static String decrypt(String ciphertext, Map<Character, Character> keyMap) {
		        Map<Character, Character> inverseMap = new HashMap<>();
		        for (Map.Entry<Character, Character> entry : keyMap.entrySet()) {
		            inverseMap.put(entry.getValue(), entry.getKey());
		        }

		        StringBuilder plaintext = new StringBuilder();
		        for (int i = 0; i < ciphertext.length(); i++) {
		            char c = ciphertext.charAt(i);
		            plaintext.append(inverseMap.getOrDefault(c, c));
		        }
		        return plaintext.toString();
		    }
		}
