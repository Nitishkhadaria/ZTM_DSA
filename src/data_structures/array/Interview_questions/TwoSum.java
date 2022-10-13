package Interview_questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int result[] = twoSum(nums, target);
        for (int i : result) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                output[0] = map.get(nums[i]);
                output[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return output;
    }

}
