import java.util.Arrays;
    
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j] == 1 || board[i][j] == 2 ) continue;
                if(j-1 >= 0 && board[i][j-1] == 1) {
                    board[i][j] = 2; continue;
                } else if(j+1 < board[i].length && board[i][j+1] == 1) {
                    board[i][j] = 2; continue;
                }
                if(i+1 < board.length){
                    if(board[i+1][j] == 1) {
                        board[i][j] = 2; continue;
                    } else if(j-1 >= 0 && board[i+1][j-1] == 1) {
                        board[i][j] = 2; continue;
                    } else if(j+1 < board[i].length && board[i+1][j+1] == 1) {
                        board[i][j] = 2; continue;
                    }
                }
                if(i-1 > 0){
                    if(board[i-1][j] == 1) {
                        board[i][j] = 2; continue;
                    } else if(j-1 >= 0 && board[i-1][j-1] == 1) {
                        board[i][j] = 2; continue;
                    } else if(j+1 < board[i].length && board[i-1][j+1] == 1) {
                        board[i][j] = 2; continue;
                    }
                }
            }
        }
        String str = Arrays.deepToString(board);
        System.out.println(str);
        answer = str.length() - str.replace("0", "").length();
        return answer;
    }
}