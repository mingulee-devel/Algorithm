class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        Boolean check = false;
        
        if(ineq.equals(">")){
            if(eq.equals("=")) check = n >= m;
            else check = n > m;
        } else {
            if(eq.equals("=")) check = n <= m;
            else check = n < m;
        }
        
        return check ? 1 : 0;
    }
}