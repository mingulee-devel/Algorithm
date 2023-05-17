class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0 ; i < n ; i++){
            answer = checkFunc(answer);
        }
        return answer;
    }
    
    public int checkFunc(int a){
        a++;
        if((a >= 3 && a % 3 == 0) || Integer.toString(a).contains("3")) {
            return checkFunc(a);
        }
        return a;
    }
}