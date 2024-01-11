import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String comp : completion){
            if(map.containsKey(comp)) map.put(comp, map.get(comp)+1);
            else map.put(comp, 1);
        }
        for(String part:participant) {
            if(!map.containsKey(part)) return part;
            if(map.get(part) > 1) map.put(part, map.get(part)-1);
            else map.remove(part);
        }
        return answer;
    }
}