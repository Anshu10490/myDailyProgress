class solution{
public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int n = nums.length;
        int count =0;
        int max = 0;
        int curr = 0;
        for(int i=0; i<n-1;i++){
            max = Math.max(max, nums[i]+i);
            if(curr==i){
                curr = max;
                count++;
            }
        }
        return count;
}
}
