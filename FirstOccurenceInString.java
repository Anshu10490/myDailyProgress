public class FirstOccurenceInString {
        public int strStr(String haystack, String needle) {
            int i=0;
            int j=0;
            int si=0;
            while(i<haystack.length()&& j<needle.length()){
                if(haystack.charAt(i)==needle.charAt(j)){
                    i++;
                    j++;
                    if(j==needle.length())
                    return si;
                }
                else{
                    i=si+1;
                    j=0;
                    si=i;
                }
            }
            return -1;
        }
    }
