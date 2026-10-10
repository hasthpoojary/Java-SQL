class Solution {
    public boolean equalFrequency(String word) {
        int[] a = new int[26];
        for (int i = 0; i < word.length(); i++) {
            a[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] > 0) {
                a[i]--;
                int n = 0;
                boolean b = true;
                for (int j = 0; j < 26; j++) {
                    if (a[j] > 0) {
                        if (n == 0) {
                            n = a[j];
                        } else if (n != a[j]) {
                            b = false;
                            break;
                        }
                    }
                }
                a[i]++;
                if (b) {
                    return true;
                }
            }
        }
        return false;
    }
}