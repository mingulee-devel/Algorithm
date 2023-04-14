// import java.util.*;

// class Solution {
//     public int[] solution(int n) {
//         int[] answer = {};
//         List<Integer> list = new ArrayList<>();
//         for(int i = 1; i <= n; i++){
//             if(i%2 != 0) list.add(i);
//         }
        
//         answer = list.stream().mapToInt(i -> i).toArray();
//         return answer;
//     }
// }

// 참고할만한 다른 사람 풀이

class Solution {
    public int[] solution(int n) {
        int cnt = 0;

        if(n % 2 == 0) cnt = n/2;
        else cnt = n/2 + 1;

        int[] result = new int[cnt];
        int num = 1;

        for(int i=0; i<result.length; i++){
            result[i] = num;
            num = num + 2;
        }

        return result;
    }
}