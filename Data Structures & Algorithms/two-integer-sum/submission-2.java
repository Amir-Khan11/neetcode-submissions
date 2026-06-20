class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> list = new HashMap<>();
        
         for (int i = 0; i < nums.length; i++) {
            if(list.containsKey(nums[i])) {
                return new int[]{list.get(nums[i]) , i};
            }

            list.put(target - nums[i] , i);
        }
        return new int[]{-1,-1};
    }
}
