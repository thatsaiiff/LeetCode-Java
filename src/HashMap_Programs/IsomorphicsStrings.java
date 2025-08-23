package HashMap_Programs;

public class IsomorphicsStrings {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] freq = new int[26];

            // Count letters in magazine
            for (char c : magazine.toCharArray()) {
                freq[c - 'a']++;
            }

            // Check ransomNote requirements
            for (char c : ransomNote.toCharArray()) {
                freq[c - 'a']--;
                if (freq[c - 'a'] < 0) {
                    return false; // Not enough chars available
                }
            }

            return true;
        }
    }

