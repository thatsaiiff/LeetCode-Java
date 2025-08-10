package arrays;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        // Trim leading/trailing spaces, split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Reverse the words array
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}