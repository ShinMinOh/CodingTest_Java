import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int maxBox=score.length/m; // 12/3=4
        int[] box=new int[maxBox];
        int min=10,idx=0;
        
        Arrays.sort(score);
        
         for (int i = score.length - 1; i >= m-1; i -= m) {
            for (int j = i; j > i - m; j--) {
                min = Math.min(min, score[j]);
            }
            box[idx++] = min * m;
         }
        
        // for(int i=0;i<box.length;i++){
        //     System.out.println(box[i]);
        // }
        return Arrays.stream(box).sum();
    }
}