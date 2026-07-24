class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> resultset=new HashSet<>();

        for(int i : nums1){
            set.add(i);
        }

            for(int j: nums2){
                if(set.contains(j)){
                    resultset.add(j);
                }
            }
            int arr[]=new int[resultset.size()];
            int index=0;
            for(int num:resultset){
                arr[index]=num;
                index++;
            }
        
        return arr;
        
    }
}