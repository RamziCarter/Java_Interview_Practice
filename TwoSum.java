class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int y = target - nums[i];
            if(map.containsKey(y))
            {
                return new int [] {map.get(y), i};
            }
            else
            {
                map.put(nums[i], i);
            }
        }
        
        throw new IllegalArgumentException("There is not a match found within array!");
    }
}
