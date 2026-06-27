class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=0;
        for(int i:nums){
            if(set.contains(i)){
              n=i;
            }
            set.add(i);
        }
        return n;
    }
}