package TopInterviewQuestions.EasyCollection.Array;

import java.util.HashSet;
import java.util.Set;

/*
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

 */


public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        Set<String> chars = new HashSet<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j< board[i].length; j++){
                if(board[i][j] != '.') {
                    if( !chars.add("col " + j + " " + board[i][j]) ||
                            !chars.add("row " + i + " " + board[i][j]) ||
                            !chars.add("row " + i / 3 + " col " + j / 3 + " = " + board[i][j])) return false;
                }
            }
        }

        return true;
    }
}
