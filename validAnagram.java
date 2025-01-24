public class validAnagram {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length())
                    return false;
            int pos[]=new int[26];
             for(int i=0;i<s.length();i++){
                pos[s.charAt(i)-'a']++;
                }
                for(int i=0;i<t.length();i++){
                    pos[t.charAt(i)-'a']--;
                }
                for(int i=0;i<pos.length;i++){
                    if(pos[i]!=0){
                        return false;
                    }
                }
                return true;
            }
}
