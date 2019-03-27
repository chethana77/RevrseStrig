public class jumpSolution {

    public static void main(String[] args)
    {
        //System.out.println(jump(new int[]{2,3,1,1,4}));
        System.out.println(jumpeasy(new int[]{2,3,1,1,4}));
    }



    public static int jumpeasy(int[] nums) {
            int far = 0;
            int e = 0;
            int count = 0;
            for(int i = 0; i<nums.length-1; i++){
                far = Math.max(far, i+nums[i]);

                if(i == e){
                    count++;
                    e = far;
                    if(e > nums.length){
                        return count;
                    }
                }
            }
            return count;
        }

    public static int jump(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int i=0,j=0;
        int steps=1,prevsteps=Integer.MAX_VALUE,maxSteps=Integer.MAX_VALUE;
        int length=nums.length-1;
        while(i<length)
        {
            j=i+1;
            while(j<=length)
            {

                if(steps+nums[j]<length)
                {
                    steps=steps+1;
                    j+=nums[j];
                }
                if(steps+nums[j]>length)
                {
                    break;
                }
                if(steps+nums[j]==length)
                {
                    steps++;
                    break;
                }
            }

            if(prevsteps>steps)prevsteps=steps;
            steps=0;
            i++;

        }
        return prevsteps;
    }
}
