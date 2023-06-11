import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(String ca:callings){
           
            int rank=map.get(ca); //불린 이름 index로 표현 3344
           
            map.put(ca,rank-1); // kai 3-->2
            map.put(players[rank-1],rank); //poe 2-->3
            players[rank]=players[rank-1]; //kai <--poe
            players[rank-1]=ca;       //poe<--kai   
           // System.out.println("map "+map);
        }
        return players;
    }
}