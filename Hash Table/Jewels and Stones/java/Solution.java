import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        char []c=jewels.toCharArray();
        char[] r=stones.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        set.add(c[i]);
        }
        int count=0;
        for(int i=0;i<r.length;i++)
        {
if(set.contains(r[i]))
count++;
        }
        return count;
        
    }
}
