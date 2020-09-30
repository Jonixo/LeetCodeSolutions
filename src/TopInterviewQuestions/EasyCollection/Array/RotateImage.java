package TopInterviewQuestions.EasyCollection.Array;

/*

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation

*/


public class RotateImage {
    public void rotate(int[][] matrix) {

        int length = matrix.length;
        int[][] result = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                result[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][matrix[i].length - 1-j] = result[i][j];
            }
        }
    }
}
