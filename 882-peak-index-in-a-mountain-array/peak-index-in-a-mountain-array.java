class Solution {
    public int peakIndexInMountainArray(int[] arr) {
          int start = 0;
        int end = arr.length-1;

        

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in the decreasing part of array this may be the answer
                // this is why this is not mid-1
                end = mid;
            }else{
                // you are in ascending part of array 
                // because we know that element mid+1 element is greather than mid element,hence we are ignoring the mid element 
                start = mid +1;

            }
        }

        // in the end start == end and pointing to the largest number because of the two checks above
        // start and end are always trying to find max element in above two checks 
        // hence when they are pointing to just one element , that is the max one beacuse that is what check says
        // more elaborationn at every point of time for start and end they have the best possible answer till thaat time
        // if we are saying only one item is reaming hence because of above line that is the best possible answer

        return end;
        
    }
}