class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> containVal = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            
            if (containVal.containsKey(val)) {
                return new int[]{containVal.get(val) , i};
            }
            
            containVal.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
