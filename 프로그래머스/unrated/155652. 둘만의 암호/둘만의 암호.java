class Solution {
    public String solution(String s, String skip, int index) {
        String answer="";
        //String temp[]
             
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
            for(int j=0;j<index;j++){
                c+=1;
                //System.out.println(c);
                if(c>'z'){
                    c-=26;
                }
                if(skip.contains(String.valueOf(c))){
                    j--;
                }
                
            }
            answer+=c;
        }
       // System.out.print(answer);
        return answer;
    }
}