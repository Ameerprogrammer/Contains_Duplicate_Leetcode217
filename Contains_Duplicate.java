class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums.length == 0) { 
            System.out.println("The array is empty");
        }

        HashSet<Integer> set = new HashSet<>();
    
        //loop through array to check values
        for(int i = 0; i < nums.length; i++) { 

            if(set.contains(nums[i])) { 
                return true; //duplicate found
            }
            set.add(nums[i]);

        }
        return false;
    }
}
