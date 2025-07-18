class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans= {-1,-1};
        // check for the first occurance if target first
        // You cannot specify parameter[] types when calling a method. inside this ()
        int start = search(nums, target,true);
        int end = search(nums,target,false);


        ans[0]= start;
        ans[1] = end;

        return ans;
        
    }

    

    // this function just return the index value of target
        int search(int[] nums , int target , boolean findStartIndex){

            int ans = -1;

            int start = 0;
            int end = nums.length-1;
              while(start<=end){

            int mid = start + (end-start)/2;

          
                if(target>nums[mid]){
                    start = mid+1;
                }
                else if(target<nums[mid]) {
                    end= mid-1;
                }
                else{
                    // potential ans may found or they  are equal to target value but start index                      may  be   lies on left or right hand side
                    ans = mid ;
                    if(findStartIndex){
                        end = mid -1;
                    }
                    else{
                        start = mid +1;
                    }
                }
            }
        return ans;
        
        
    }
}