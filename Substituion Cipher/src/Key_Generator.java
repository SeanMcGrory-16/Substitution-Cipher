	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	
public class Key_Generator {

	    public static Map<Character, Character> generateCipherKey() {
	        List<Character> letters = new ArrayList<>();
	        for(char c = 'a'; c <= 'z'; c++) {
	            letters.add(c);
	        }
	        Collections.shuffle(letters);

	        Map<Character, Character> keyMap = new HashMap<>();
	        char start = 'a';
	        for (Character c : letters) {
	            keyMap.put(start++, c);
	        }

	        return keyMap;
	   
	}

}
