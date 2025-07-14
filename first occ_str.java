class Solution {
    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            // Check substring from i to i+nLen
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(strStr("sadbutsad", "sad"));     
        System.out.println(strStr("leetcode", "leeto"));    
    }
}
