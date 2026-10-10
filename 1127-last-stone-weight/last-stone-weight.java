class Solution {
    public int lastStoneWeight(int[] stones) {
            while (stones.length > 1) {
            Arrays.sort(stones);
            int n = stones.length;
            int a = stones[n - 1];
            int b = stones[n - 2];
            stones = Arrays.copyOf(stones, n - 1);
            stones[n - 2] = a - b;
        }
        return stones[0];
    }
}