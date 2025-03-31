class Solution {
    public boolean check(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        // Also check the last element with the first element for circular rotation
        if (arr[n - 1] > arr[0]) {
            count++;
        }

        return count <= 1;
    }
}
