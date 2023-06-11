function solution(s) {
    let stack = [];
    let count = 0;
    
    for(let i = 0; i < s.length; i += 1){
        stack.push(s[i]);
        //console.log(stack)
        const same = stack.filter((item) => item === stack[0]);
        const notSame = stack.filter((item) => item !== stack[0]);
       
        if(same.length === notSame.length){
            count += 1;
            stack = [];
        }
    }
    
    if(stack.length !== 0){ //두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 지금까지 읽은 문자열 분리하고, 종료.
        count += 1;
    }
    
    return count;

}