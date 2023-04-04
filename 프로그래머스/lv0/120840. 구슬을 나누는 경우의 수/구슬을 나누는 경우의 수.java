import java.lang.Math.*;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double un1 = 1;
        double un2 = 1;
        double dn = 1; //곱한 값이 오버플로우 날 수 있음
        
        for(int i = balls - share + 1; i <= balls  ; i++){
            un1 = un1 * i;
        }
        
        for(int i = balls; i >= balls - share + 1 ; i--){
            un2 = un2 * i;
        }
        
        System.out.println(un1);
        System.out.println(un2);
        
        for(int i = share; i > 0 ; i--){
            dn = dn * i;
        }
        answer = (int)Math.round(un1/dn);
        
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