class Solution {
    static int[] nums;
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int  total = n * (n+1) /2;

        int sum =0;
         for (int i = 0;  i< nums.length; i++){

            sum= sum+ nums[i];

         }

         return total - sum; }

         public static void main (String[]args){
           
         Solution obj = new Solution(); 
         System.out.println(obj.missingNumber(nums));
         }
        
    }
