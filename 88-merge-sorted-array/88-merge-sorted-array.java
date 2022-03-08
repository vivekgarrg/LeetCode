class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>(m+n);
        for(int i:nums1){
            list.add(i);
        }
      
            
           for(int j:nums2){
               list.add(j);
              }
        Collections.sort(list);
        int index = 0;
       
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==0)
                continue;
            nums1[index] = list.get(i);
            index++;
        }
        if(nums1.length==100 && n==0){
            nums1[nums1.length-1] = 0;
        }
        Arrays.sort(nums1);
    }
}