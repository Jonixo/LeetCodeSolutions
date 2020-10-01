package TopInterviewQuestions.EasyCollection.String;

/*

Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++)
            alphabet[s.charAt(i) - 'a']++;


        for (int i = 0; i < s.length(); i++)
            if (alphabet[s.charAt(i) - 'a'] == 1)
                return i;


        return -1;
    }
}
