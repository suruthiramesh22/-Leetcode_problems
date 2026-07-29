import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;

        while(left <= right){
           int leftsum=nums[left]*nums[left];
           int rightsum=nums[right]*nums[right];

           if(leftsum > rightsum){
            arr[index]=leftsum;
            left++;
            
           }
           else{
            arr[index]=rightsum;
            right--;
           }
           index--;
        }

        return arr;
    }
}