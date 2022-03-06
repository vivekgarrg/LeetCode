import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<nums.length; i++){
           if(nums[i]==val){
               continue;
           }
           list.add(nums[i]);
       }    
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}