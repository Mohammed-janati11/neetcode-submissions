class Solution {
    public int search(int[] nums, int target) {
        int left=0,rigth=nums.length;
        

while(left<rigth){
    int m=(left+rigth)/2;
        if(target==nums[m]){
            return m;
        }else if(target<nums[m]){
            rigth=m;
        }else if(target>nums[m]){
            left=m+1;
        }

    }
    return -1;
    }
}
