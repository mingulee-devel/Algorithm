class Solution {
    public int solution(int n) {
        return n % 2 == 0 ? 4*(n/2)*((n/2)+1)*(2*(n/2)+1)/6 : (n/2+1)*(n/2+1) ;
    }
}