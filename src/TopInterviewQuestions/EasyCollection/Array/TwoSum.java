package TopInterviewQuestions.EasyCollection.Array;

import java.util.HashMap;
import java.util.Map;

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 */

public class TwoSum {

    // Fast(2MS) but uses  39.3MB Memory
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; map.put(nums[i], i++))
            if (map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]), i};
        return new int[] {0, 0};
    }

    //Really slow and I mean REALLY (55ms) BUT uses whole 4KB less memory (38.9)
    public int[] twoSum2(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
        }
        return new int[] {0, 0};
    }

}

