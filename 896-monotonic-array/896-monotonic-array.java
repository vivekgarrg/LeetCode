class Solution {
    public boolean isMonotonic(int[] nums) {
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[nums.length-1]>nums[0]){
                if(nums[i]<=nums[i+1]){
                }else{
                    return false;
                }
            }else if(nums[nums.length-1]==nums[0]){
                if(nums[i]==nums[i+1]){
                }else{
                    return false;
                }
            }else{
                if(nums[i]>=nums[i+1]){
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}