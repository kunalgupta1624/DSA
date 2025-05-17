class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // we Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
           
            if (digits[i] < 9) {
                digits[i]++;       // If current digit is less than 9, increment and return
                return digits;
            }
            
            digits[i] = 0;
        }

       
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
