class Solution {
    public int appendCharacters(String s, String t) {
      Queue<Character> a=new LinkedList<>();

      for(int i=0;i<t.length();i++){
        a.add(t.charAt(i));
      }

      for(int i=0;i<s.length() && a.size()!=0;i++){
        if(s.charAt(i)==a.peek()){
            a.poll();
        }
      }
      return a.size();
    }
}