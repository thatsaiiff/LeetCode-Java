package arrays;
// Problem 68: Text Justification
// Approach: Greedy packing, distribute spaces
import java.util.*;

class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLen = words[i].length();
            int j = i + 1;

            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length();
                j++;
            }

            StringBuilder sb = new StringBuilder();
            int numWords = j - i;
            int spaces = maxWidth - (lineLen - (numWords - 1));

            if (j == words.length || numWords == 1) { // Left-justified
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else { // Fully-justified
                int extra = spaces % (numWords - 1);
                int spaceEach = spaces / (numWords - 1);

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < spaceEach; s++) sb.append(" ");
                        if (extra-- > 0) sb.append(" ");
                    }
                }
            }
            result.add(sb.toString());
            i = j;
        }
        return result;
    }
}