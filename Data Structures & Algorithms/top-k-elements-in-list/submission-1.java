class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> a= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
            a.put(nums[i],a.get(nums[i])+1);
            }else{
            a.put(nums[i],1);
 
            }
        }
        return a.entrySet().stream()
        .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
