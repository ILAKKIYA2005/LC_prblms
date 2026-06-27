import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
      int[]arr=new int[nums.length];
      int k=0;
      for(int i=0;i<nums.length;i++)
      {
        double s=Math.pow(nums[i],2);
        arr[k++]=(int)s;
      }  
      Arrays.sort(arr);
      return arr;
    }
}