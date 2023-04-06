
import java.util.*;
import java.lang.Math;

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

// import java.util.*;

// class Solution {
//     public int solution(int[] array) {
//         int answer = 0;
        
//         List<Integer> list = new ArrayList<>();
//         List<Integer> list2 = new ArrayList<>();
//         int[] arr = new int[array.length];
//         int[] arr2 = new int[array.length];
//         Arrays.sort(array);
        
//         for(int a : array){
//             if(list.indexOf(a) == -1){
//                 list.add(a);
//                 list2.add(1);
//                 continue; 
//             }
//             list2.set(list.indexOf(a), list2.get(list.indexOf(a)) + 1);
//         }
        
//         int maxCount = -1;
//         for(Integer b : list2){
//             if(maxCount)
//         }
        
//         return answer;
//     }
// }