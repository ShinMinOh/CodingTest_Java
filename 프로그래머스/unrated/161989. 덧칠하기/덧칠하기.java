
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx=0;
        int max=0;
        
        for(int sec:section){
             if(sec>max){
                 answer++;
                 max=sec+m-1;
             }
            //System.out.println(sec);
        }
        
        return answer;
    }
}