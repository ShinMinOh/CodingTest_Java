class Solution {
    public int solution(int n) {
        int answer = 0;
        int result=count_one(n);

        while(true){
            ++n;
            if(result==count_one(n)){
            return n;
            }
            
        }
    }
    public int count_one(int num){
        int count=0;
        count=Integer.bitCount(num);
        
      
        return count;
    }
   
  
}