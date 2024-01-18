class Solution {
    public boolean containsDuplicate(int[] nums) {

        //left pointer first
        for(int left = 0; left < nums.length; left++) { 

            //then right pointer
            for(int right = left + 1; right < nums.length; right++) {
                if(nums[left] == nums[right]) {
                    return true;
                }
            }
        }
        return false;
    }
}