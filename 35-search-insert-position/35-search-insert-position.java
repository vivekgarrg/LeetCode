class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length-1;
        
        while(r>=l){
            
        int mid = l + (r - l) / 2;
            
        if(nums[mid]==target){
            return mid;
        }
        
        if(target<nums[mid]){
            r = mid-1;
        }
        else{
            l = mid+1;    
            }
        }
        return l;
    }
}