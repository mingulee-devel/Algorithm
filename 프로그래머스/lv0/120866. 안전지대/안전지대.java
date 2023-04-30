class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(board[i][j] == 1 || board[i][j] == 2 ) continue;
                if(j-1 >= 0 && board[i][j-1] == 1) {
                    continue;
                } else if(j+1 < board[i].length && board[i][j+1] == 1) {
                    continue;
                }
                if(i+1 < board.length){
                    if(board[i+1][j] == 1) {
                        continue;
                    } else if(j-1 >= 0 && board[i+1][j-1] == 1) {
                        continue;
                    } else if(j+1 < board[i].length && board[i+1][j+1] == 1) {
                        continue;
                    }
                }
                if(i-1 > 0){
                    if(board[i-1][j] == 1) {
                        continue;
                    } else if(j-1 >= 0 && board[i-1][j-1] == 1) {
                        continue;
                    } else if(j+1 < board[i].length && board[i-1][j+1] == 1) {
                        continue;
                    }
                }
                answer += 1;
            }
        }
        return answer;
    }
}
