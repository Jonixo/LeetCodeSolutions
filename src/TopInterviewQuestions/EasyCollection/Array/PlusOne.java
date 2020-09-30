package TopInterviewQuestions.EasyCollection.Array;

/*

Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

*/
public class PlusOne {
        public int[] plusOne(int[] digits) {

            int index = digits.length - 1;
            //starting from the end of the array converting 9's to 0
            while (index >= 0 && digits[index] == 9) {
                digits[index] = 0;
                index--;
            }
            //if first index is also 9 creating a new array, changing first index value to 1 and rest 0
            if (index == -1) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            }
            //if first index is not 9 incrementing it by one
            digits[index]++;
            return digits;

        }

}
