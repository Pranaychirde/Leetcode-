import java.util.*;

class Solution {
    public int checkDuplicate(int i, int operation, int[] nums, int n) {
        if (i >= n) {
            return operation;
        }

        Map<Integer, Boolean> map = new HashMap<>();
        boolean hasDuplicate = false;

        // Check from i to n if there's any duplicate
        for (int j = i; j < n; j++) {
            if (map.containsKey(nums[j])) {
                hasDuplicate = true;
                break;
            }
            map.put(nums[j], true);
        }

        if (!hasDuplicate) {
            // All elements from i to end are unique
            return operation;
        }

        // Recursive call with i + 3 and operation + 1
        return checkDuplicate(i + 3, operation + 1, nums, n);
    }

    public int minimumOperations(int[] nums) {
        int i = 0;
        int n = nums.length;
        int operation = 0;

        return checkDuplicate(i, operation, nums, n);
    }
}
