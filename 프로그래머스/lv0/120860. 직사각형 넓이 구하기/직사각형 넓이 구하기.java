class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int wmax = dots[0][0];
        int wmin = dots[0][0];
        int hmax = dots[0][1];
        int hmin = dots[0][1];
        
        for(int i = 0; i < dots.length ; i++){
            if(wmax < dots[i][0]) wmax = dots[i][0];
            if(wmin > dots[i][0]) wmin = dots[i][0];
            if(hmax < dots[i][1]) hmax = dots[i][1];
            if(hmin > dots[i][1]) hmin = dots[i][1];
        }
        
        answer = (wmax - wmin) * (hmax - hmin);
        return answer;
    }
}