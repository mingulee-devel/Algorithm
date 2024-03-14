class Solution {
    public int solution(int a, int b) {
        
        String m = ""+a+b;
        String n = ""+b+a;
        
        if(Integer.valueOf(m) > Integer.valueOf(n)) return Integer.valueOf(m);
        return Integer.valueOf(n);
    }
}