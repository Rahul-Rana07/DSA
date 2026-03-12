1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3       int [] ans = new int [2];
4
5       HashMap <Integer , Integer> mpp = new HashMap <>();
6       for(int i = 0 ; i < nums.length ; i++){
7        int num = nums[i];
8        int moreNeeded = target - num;
9        if(mpp.containsKey(moreNeeded)){
10            ans[0] = mpp.get(moreNeeded);
11            ans[1] = i;
12        }
13        mpp.put(nums[i], i);
14       }
15       return ans;
16    }
17}