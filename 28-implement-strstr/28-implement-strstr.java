class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        
        if(needle.equals(haystack))
            return 0;
        int index = -1;
        
        if(haystack.contains(needle)){
            index = haystack.indexOf(needle);
        }
        return index;
    }
}