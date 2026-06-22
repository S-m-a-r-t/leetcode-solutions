class Solution {
    public int majorityElement(int[] digits) {
        Arrays.sort(digits);
        return digits[digits.length/2];
    }
}