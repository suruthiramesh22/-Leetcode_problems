class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int eventcount=0;
            int temp=nums[i];
            while(temp>0){
                temp/=10;
                eventcount++;
            }
            if(eventcount%2==0){
                count++;
            }
        }
        return count;
        
    }
}