package arrays;
// Problem 380: Insert Delete GetRandom O(1)
// Approach: ArrayList + HashMap
import java.util.*;

class RandomizedSet {
    private List<Integer> nums;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int idx = map.get(val);
        int last = nums.get(nums.size() - 1);
        nums.set(idx, last);
        map.put(last, idx);
        nums.remove(nums.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}