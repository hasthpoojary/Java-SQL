class Solution {
    public boolean equalFrequency(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word.length(); i++) {
            int[] temp = count.clone();
            temp[word.charAt(i) - 'a']--;
            int freq = 0;
            boolean same = true;
            for (int j = 0; j < 26; j++) {
                if (temp[j] > 0) {
                    if (freq == 0) {
                        freq = temp[j];
                    } else if (freq != temp[j]) {
                        same = false;
                        break;
                    }
                }
            }
            if (same) {
                return true;
            }
        }
        return false;
    }
}