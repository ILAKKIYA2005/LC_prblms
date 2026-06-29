import java.util.*;

class Solution {

    int count = 0;

    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        solve(nums, 0);
        return count;
    }

    void solve(int[] nums, int index) {

        if (index == nums.length) {
            count++;
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {

            
            if (set.contains(nums[i]))
                continue;

            set.add(nums[i]);

           
            if (index > 0) {
                int sum = nums[index - 1] + nums[i];
                int root = (int) Math.sqrt(sum);

                if (root * root != sum)
                    continue;
            }

            swap(nums, index, i);

            solve(nums, index + 1);

            swap(nums, index, i);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}