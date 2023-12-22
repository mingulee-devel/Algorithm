import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        int result = 0;
        
        if(arr[0] == arr[3]) result = 1111*arr[0];
        else if(arr[0] != arr[3] && (arr[0] == arr[2] || arr[1] == arr[3])) {
            if(arr[0] == arr[2]) result =  (10 * arr[0] + arr[3])*(10 * arr[0] + arr[3]);
            else result =  (10 * arr[3] + arr[0])*(10 * arr[3] + arr[0]);
        }
        else if(arr[0] == arr[1] && arr[2] == arr[3]) {
            int abs = 0;
            if(arr[0] > arr[2]) abs = arr[0]-arr[2];
            else abs = arr[2]-arr[0];
            result = (arr[0] + arr[2]) * abs;
        } else if(arr[0] == arr[1]) result = arr[2]*arr[3];
        else if(arr[1] == arr[2]) result = arr[0]*arr[3];
        else if(arr[2] == arr[3]) result = arr[0]*arr[1];
        else result = arr[0];
        
        return result;
    }
}