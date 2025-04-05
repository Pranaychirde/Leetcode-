class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Boolean> hm = new HashMap<>();
        //Precomputation.
        for(int i = 0;i<n;i++){
         hm.put(nums[i],true);
        }

        // cheecking whether is it present or not ?
        for(int i = 0;i<=n;i++){
            if(!hm.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}