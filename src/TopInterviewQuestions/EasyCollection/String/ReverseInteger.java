package TopInterviewQuestions.EasyCollection.String;

/*

Given a 32-bit signed integer, reverse digits of an integer.

*/
public class ReverseInteger {

    public int reverse(int x) {

        long res = 0;

        while (x != 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }

        return (int)res == res ? (int)res : 0;
    }

}
