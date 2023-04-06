
import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : array){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            } else {
                map.put(a, 1);
            }
        }
        
        for(Integer key : map.keySet()){
            if(answer == -1 || map.get(key) > map.get(answer)) answer = key;
        }
        
        for(Integer key : map.keySet()){
            if(answer != key && map.get(answer) == map.get(key)) return -1;
        }
        
        return answer;
    }
}
