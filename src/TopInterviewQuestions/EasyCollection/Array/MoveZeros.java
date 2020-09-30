package TopInterviewQuestions.EasyCollection.Array;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*/

public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int i = 0;
        //For every element
        for (int n : nums) {
            //Check if value is zero
            if (n != 0)
                //If not zero assign value to stored index
                nums[i++] = n;
        }
        //Assign zero to rest of the array
        while (i < nums.length) nums[i++] = 0;
    }
}


