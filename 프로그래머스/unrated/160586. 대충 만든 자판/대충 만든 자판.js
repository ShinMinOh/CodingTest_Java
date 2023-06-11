function solution(keymap, targets) {
    let length = keymap.length;
    let Object = [];
    let test=[];
    
    keymap.map((v) => { //keymap의 key와 value값 map으로 저장
        let data = v.split("");
        data.map((w,i) => {
            Object.push({
            key : w,
            value : i+1
        })
        })
    })
    Object = Object.sort((a,b) => a.value - b.value); //value순으로 소팅.
    console.log(Object)
    
    Object.map(v => {  //같은글자가 존재할때 적게 누르는 알파벳과 횟수저장:test
        let aa = test.find(w=>w.key === v.key);
        if(aa === undefined){
            test.push({
                key : v.key,
                value : v.value
            })            
        }
    })
    console.log("test",test)
    
      let result = [];
    targets.map(v => {
        let cnt = 0;
        let word = v.split("");  //targets 하나하나 쪼개기["A","S","A"]
        word.map(w => {
            let testdata = test.find(d => d.key === w)?.value; //target의 쪼갠알파벳들이 test에 있는지 find
            if(cnt !== -1){
            testdata === undefined ? 
                cnt = -1
                : cnt = parseInt(testdata) + cnt;}
                      })

        result.push(cnt);
    })
    return result
   
}