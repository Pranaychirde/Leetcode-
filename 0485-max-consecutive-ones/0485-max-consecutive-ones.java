class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxLength = 0;
        for(int i = 0;i<n;i++){
           if(nums[i]==1){
            sum+=1;
            maxLength = Math.max(sum,maxLength);
           }else{
            sum  = 0;
           }
        }
        return maxLength;
    }
}