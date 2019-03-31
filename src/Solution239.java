import java.util.Arrays;

public class Solution239 {


    public static void main(String[] args)
    {
       System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7},3)));

    }

        public static int[] maxSlidingWindow(int[] nums, int k) {

            int j=0;
            int length=nums.length-(k-1);
            int[] output= new int[length];

            for(int i=k-1;i<nums.length;i++)
            {
                output[j]= findMax(Arrays.copyOfRange(nums, i-k+1, i+1));

                j++;
            }

            return output;

        }

        public static int findMax(int[] subarray)
        {
            int max=0;
            for(int j=0; j<subarray.length;j++)
            {
                max= Math.max(max,subarray[j]);
            }

            return max;
        }
    }

