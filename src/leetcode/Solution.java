package leetcode;

class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) return digits;
        int carry = 1, n = digits.length;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (carry == 0) return digits;
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return carry == 0 ? digits : res;
    }




    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {0,0,1};
        s.plusOne(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

}