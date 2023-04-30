class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.replaceAll(" ", "").split("\\+");
        long x = 0;
        long b = 0;
        
        for(String a : arr){
            if(a.contains("x")){
                if(a.length() > 1) x += Long.parseLong(a.substring(0, a.length()-1));
                else x += 1;
            } else {
                b += Long.parseLong(a);
            }
        }
        if(x == 0 && b == 0) answer += 0;
        else if(x == 0 && b > 0) answer += b + "";
        else if(x > 0 && b == 0) {
            if(x > 1) answer = x+"x";
            else answer = "x";
        }
        else if(x == 1) answer = "x + "+b;
        else answer = x+"x + "+b;
        return answer;
    }
}