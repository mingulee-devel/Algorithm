import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%2 != 0) list.add(i);
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}