class Solution {
    public static int trap(int[] height) {
         // clculate left max boundary
         int n = height.length;
        int leftMax [] = new int[n];
        leftMax[0]= height[0];

        for (int i =1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        // calculate right max boundary 
        int rightMax [] =new int[n]; 
        rightMax[n-1] = height[n-1];
        for (int i =n-2; i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        // they both are auxilaary arrays 
        int trappedwater = 0;
        // than loop 
        for (int i =0; i<n; i++){
            // water level = min (leftmax boundarie, right boundarie) - height of bar [i]
                    //  = trapped water
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

        


        

        
        
    }
    public static void main (String args[]){
        int height[] = {4,2,0,3,2,5};
        System.out.println(trap(height));

    }
}