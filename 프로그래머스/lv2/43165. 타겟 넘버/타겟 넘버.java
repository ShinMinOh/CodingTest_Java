class Solution {
    int count=0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        
        return count;
    }
    
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){  //마지막 노드까지 탐색
            if(target == sum){
                count++;
            }
            return;
        }
        
        int plus = sum + numbers[depth];
        int minus = sum - numbers[depth];
        
        dfs(numbers, depth+1, target, plus);
        dfs(numbers, depth+1, target, minus);

    }
}