package TopInterviewQuestions.EasyCollection.String;
/*

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        int left = 0,right = s.length() - 1;

        s = s.toLowerCase();

        while (left < right) {

            if (!Character.isAlphabetic(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isAlphabetic(s.charAt(right)) && !Character.isDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
