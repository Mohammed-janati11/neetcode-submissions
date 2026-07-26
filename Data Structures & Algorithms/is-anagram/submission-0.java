class Solution {
    public boolean isAnagram(String s, String t) {

Map<Character,Integer> map=new HashMap<>();
    Map<Character,Integer> map2=new HashMap<>();
for(char i:s.toCharArray()){
    if(map.containsKey(i)){
        map.put(i,map.get(i)+1);
    }else{
        map.put(i,1);
    }
}

for(char i:t.toCharArray()){
    if(map2.containsKey(i)){
        map2.put(i,map2.get(i)+1);
    }else{
        map2.put(i,1);
    }
}
return map.equals(map2);


    }
}
