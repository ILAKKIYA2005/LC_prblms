class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int left=0;
       int right=0;
       int current=0;
       int count=0;
       //int ans=0;
       while(right<arr.length)
       {
        current+=arr[right];
      


        if(right-left+1==k)
        {
            {
            if(current>=k*threshold)
            count++;
        }
            

current-=arr[left];
left++;
        }
       right++;
       } 
       return count;
    }
}