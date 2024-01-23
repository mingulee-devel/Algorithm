import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<>();
        int pre = -1;
        for(int num : arr){
            if(pre < 0 || pre != num){
                list.add(num);
            }
            pre = num;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
    
    //Stack
//     public Stack<Integer> solution(int []arr) {
        
//         Stack<Integer> stack = new Stack<>();
//         for(int num : arr){
//             if(stack.size() == 0) {
//                 stack.push(num);
//                 continue;
//             }
//             int last = stack.peek();
//             if(num != last) stack.push(num);
//         }
        
//         return stack;
//     }
}