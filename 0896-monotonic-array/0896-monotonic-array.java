class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increse=true;
        boolean decrease=true;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                decrease=false;
            }
            else if(nums[i]<nums[i-1]){
                increse=false;
            }
        }
        if(increse || decrease){
            return true;
        }
        else{
            return false;
        }
        
    }
}