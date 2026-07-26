class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> valid=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(valid.containsKey(nums[i])){
                return true;
            }else{
            valid.put(nums[i],true);
            }
        }
        return false;
    }
}