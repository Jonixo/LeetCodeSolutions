package TopInterviewQuestions.EasyCollection.Array;

import java.util.ArrayList;
import java.util.List;

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