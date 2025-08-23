package HashMap_Programs;

import java.util.*;

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs.length == 0) return new ArrayList<>();

            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars); // sort characters
                String key = new String(chars); // sorted version is key

                map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            }

            return new ArrayList<>(map.values());
        }
    }

