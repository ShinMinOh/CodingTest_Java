class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1;i<=number;i++){
            if(Divcon(i)<=limit){
                answer+=Divcon(i);
            }
            else{
                answer+=power;
            }
            //System.out.print(answer);
        }
        return answer;
    }
    
    private static int Divcon(int num){
    int count=0;
    for(int i=1;i<=Math.sqrt(num);i++){
        if(i==Math.sqrt(num)){count++;}
        else if(num%i==0){count+=2;}
    }
    return count;
}
}
