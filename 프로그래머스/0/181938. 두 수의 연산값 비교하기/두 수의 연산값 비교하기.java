class Solution {
    public int solution(int a, int b) {
        
        int m = Integer.parseInt(""+a+b);
        int n = 2*a*b;
        
        return m > n ? m : n;
    }
}