public class missingNum {
        public int missingNumber(int[] nums) {
            int arr[]=new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                arr[nums[i]]=1;
            }
            int i;
            for(i=0;i<nums.length+1;i++){
                if(arr[i]!=1)
                    return i;
            }
        return i;
        }
    }
