class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>>ans=new ArrayList<>();
      com(1,k,n,new ArrayList<>(),ans);
      return ans;  
    }
    public void com(int s,int k,int n,List<Integer>list,List<List<Integer>>ans)
    {
        int sum=0;
        if(list.size()==k)
        {
            for(int num:list)
            sum+=num;
        }
        if(sum==n)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=s;i<=9;i++)
        {
       
list.add(i);
com(i+1,k,n,list,ans);
list.remove(list.size()-1);
}
    }
}
    
    
