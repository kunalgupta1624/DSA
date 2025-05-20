class Solution {
    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        
        int ans = Integer.MIN_VALUE;
        for (int person = 0 ;  person < accounts.length; person++){
            // when we start a new col , taking a new sum for that particular row
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++){
                sum+= accounts[person][account];

            }
            if (sum> ans){
                ans = sum;
            }
        }
        return ans;
    }
}