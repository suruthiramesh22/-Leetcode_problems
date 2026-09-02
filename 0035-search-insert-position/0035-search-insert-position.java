class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=nums.length;
        for(int i=0;i<pos;i++){
            if(nums[i]>=target){
                pos= i;
                
            }
        }  
        return pos;  
    }
}