class Solution {
    public int missingMultiple(int[] nums, int k) {
        for (int x = k; ; x += k) {
            boolean found = false;
            for (int n : nums) {
                if (n == x) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return x;
            }
        }
    }
}