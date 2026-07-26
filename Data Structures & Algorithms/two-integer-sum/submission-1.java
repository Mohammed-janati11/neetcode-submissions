class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int min=0,max=0;

    for(int i=0;i<nums.length;i++){
        m.put(nums[i],i);
    }
    for(int i=0;i<nums.length;i++){
        int s=target-nums[i];
        if(m.containsKey(s) && m.get(s)!=i){
            min=i;
            max=m.get(s);
        }
    }

    return min<max?new int[]{min,max}:new int[]{max,min};

    }
}
