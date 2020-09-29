package TopInterviewQuestions.EasyCollection.Array;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

public class SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {

            List<Integer> unique = new ArrayList<>();

            for (int i : nums) {
                if (!unique.contains(i)) {
                    unique.add(i);
                } else {
                    unique.remove(new Integer(i));
                }
            }

            return unique.get(0);
        }
    }
}


/*
        ****HONORABLE MENTION****
        public int singleNumber(int[] nums) {
            int a = 0;
            for (int i : nums) {
                 a ^= i;
            }
             return a;
            }
*/