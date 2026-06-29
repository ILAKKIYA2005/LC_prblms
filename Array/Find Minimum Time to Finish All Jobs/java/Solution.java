class Solution {

    int ans = Integer.MAX_VALUE;

    public int minimumTimeRequired(int[] jobs, int k) {

        int[] worker = new int[k];

        backtrack(jobs, worker, 0);

        return ans;
    }

    void backtrack(int[] jobs, int[] worker, int index) {

        if (index == jobs.length) {

            int max = 0;

            for (int i = 0; i < worker.length; i++) {
                max = Math.max(max, worker[i]);
            }

            ans = Math.min(ans, max);
            return;
        }

        for (int i = 0; i < worker.length; i++) {

            worker[i] += jobs[index];

            backtrack(jobs, worker, index + 1);

            worker[i] -= jobs[index];

            
            if (worker[i] == 0)
                break;
        }
    }
}