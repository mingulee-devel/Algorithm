import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Set<Integer> test = new HashSet<>();
        //큰 값을 [0], 작은 값을 [1]에 담아줌.
        if(sides[0] < sides[1]) {
            int temp = sides[0];
            sides[0] = sides[1];
            sides[1] = temp;
        }
        
        //둘 중 하나가 긴 변인 경우 (1 <= x < max)
        //나머지 한 변이 가장 긴 변인 경우 (max <= x < max+min)
        for(int i = 1; i < sides[0]+sides[1] ; i++){
            if(i+sides[1] <= sides[0]) continue;
            if(sides[1]+sides[0] <= i) continue;
            if(sides[0]+i <= sides[1]) continue;
            test.add(i);
        }
        
        answer = test.size();
        return answer;
    }
}