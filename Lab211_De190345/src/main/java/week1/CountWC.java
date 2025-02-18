package week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CountWC {
    
    private final String input;

    public CountWC(String input) {
        this.input = input;
    }
    
    
    public Map<String, Integer> countWord() {
        Map<String, Integer> wordCount = new HashMap<>();
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }   
    
    
    public Map<Character, Integer> countCharacter() {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            char lowerCaseChar = Character.toLowerCase(c);
            charCount.put(lowerCaseChar, charCount.getOrDefault(lowerCaseChar, 0) + 1);
        }
        return charCount;
    }
}