class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double un = 1;
        double dn = 1; //곱한 값이 오버플로우 날 수 있음
        
        for(int i = balls; i >= balls - share + 1 ; i--){
            un = un * i;
        }
        for(int i = share; i > 0 ; i--){
            dn = dn * i;
        }
        answer = (int)(un/dn);
        
        return answer;
    }
}