class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int right=0;
        int current=0;
        int ans=0;
        while(right<s.length())
        {
            if(isVowel(s.charAt(right)))
            {
current++;
            }
            if(right-left+1==k)
            {
                ans=Math.max(ans,current);
            
            
               if(isVowel(s.charAt(left)))
            {
current--;
            }  
            left++;
        }
        right++;
        }
return ans;
    }
    public boolean isVowel(char ch)
    {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}