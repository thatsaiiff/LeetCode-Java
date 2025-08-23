package HashMap_Programs;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
        public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");

            // Length mismatch check
            if (pattern.length() != words.length) {
                return false;
            }

            Map<Character, String> charToWord = new HashMap<>();
            Map<String, Character> wordToChar = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = words[i];

                // If char already mapped, check consistency
                if (charToWord.containsKey(c)) {
                    if (!charToWord.get(c).equals(word)) {
                        return false;
                    }
                } else {
                    charToWord.put(c, word);
                }

                // If word already mapped, check consistency
                if (wordToChar.containsKey(word)) {
                    if (wordToChar.get(word) != c) {
                        return false;
                    }
                } else {
                    wordToChar.put(word, c);
                }
            }

            return true;
        }
    }

