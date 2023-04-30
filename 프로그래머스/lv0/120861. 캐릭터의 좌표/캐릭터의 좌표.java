class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String k : keyinput){
            if(k.equals("up")){
                if(answer[1] < board[1]/2){
                    answer[1] += 1;
                }
            } else if(k.equals("down")){
                if(answer[1] > -board[1]/2){
                    answer[1] -= 1;
                }
            } else if(k.equals("left")){
                if(answer[0] > -board[0]/2){
                    answer[0] -= 1;
                }
            } else { //right
                if(answer[0] < board[0]/2){
                    answer[0] += 1;
                }
            }  
        }
        
        return answer;
    }
}