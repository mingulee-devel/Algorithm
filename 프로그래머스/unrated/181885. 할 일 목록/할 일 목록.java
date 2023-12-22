import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // List<String> answer = new ArrayList<>();
        // for(int i = 0; i < todo_list.length ; i++){
        //     if(finished[i] == false) answer.add(todo_list[i]);
        // }
        // return answer.toArray(new String[answer.size()]);
        
        String str = "";
        for(int i=0; i<finished.length; i++){
            str = finished[i]==false ? str+todo_list[i]+"," : str;
        }

        return str.split(",");
    }
}