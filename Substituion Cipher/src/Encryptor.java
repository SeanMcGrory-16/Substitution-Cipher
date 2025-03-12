import java.util.Map;
import java.util.HashMap;
public class Encryptor {
	
		    public static String encrypt(String plaintext, Map<Character, Character> keyMap) {
		        StringBuilder ciphertext = new StringBuilder();
		        for (int i = 0; i < plaintext.length(); i++) {
		            char c = plaintext.charAt(i);
		            ciphertext.append(keyMap.getOrDefault(c, c));
		        }
		        return ciphertext.toString();
		    }
		}

