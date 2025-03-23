class Solution {
    public int removeDuplicates(int[] nums) {
  Set<Integer> set = new TreeSet<>(); // TreeSet maintains sorted order

        for (int num : nums) {
            set.add(num);
        }

        // Overwriting the original array with unique elements
        int index = 0;
        for (int num : set) {
            nums[index++] = num;
        }

        return index; // Return the new length of unique elements
    }
}