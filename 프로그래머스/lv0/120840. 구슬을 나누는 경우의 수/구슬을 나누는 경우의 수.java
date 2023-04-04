import java.lang.Math.*;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double un1 = 1;
        double un2 = 1;
        double dn = 1; //1.곱한 값이 오버플로우 날 수 있음
        
        // for(int i = balls - share + 1; i <= balls  ; i++){
        //     un1 = un1 * i;
        // }
        
        for(int i = balls; i >= balls - share + 1 ; i--){
            un2 = un2 * i;
        }
        
        for(int i = share; i > 0 ; i--){
            dn = dn * i;
        } 
        
        answer = (int)Math.round(un2/dn); //2.부동소수점 오류 방지를 위해 반올림 또는 역순 for문은 오류 안남
        // answer = (int)(un1/dn); //케이스3 실패 뜨는 코드
        // answer = (int)(un2/dn); //역순 for문
        
        return answer;
    }
}

// 다른 사람 풀이 (재귀)
// class Solution {
//     public long solution(int balls, int share) {
//         share = Math.min(balls - share, share);

//         if (share == 0)
//             return 1;

//         long result = solution(balls - 1, share - 1);
//         result *= balls;
//         result /= share;

//         return result;
//     }
// }
