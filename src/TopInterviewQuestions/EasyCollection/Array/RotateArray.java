package TopInterviewQuestions.EasyCollection.Array;

public class RotateArray {

    public void rotate(int[] nums, int k) {

        int length =  nums.length;
        int[] temp = new int[length];

        for (int i = 0; i < length; i++) {
            temp[(i + k) % length] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
        System.out.println();
    }

}