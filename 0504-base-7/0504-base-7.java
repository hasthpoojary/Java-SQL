class Solution {
    public String convertToBase7(int num) {   
        if (num == 0) {
            return "0";
        }
        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = -num;
        }
        String result = "";
        while (num > 0) {
            int rem = num % 7;
            result = rem + result;
            num = num / 7;
        }
        if (negative) {
            result = "-" + result;
        }
        return result;
    }
}