import java.util.HashMap;
import java.util.Map;

public class TestFrequence {

    public  static void main(String[] args)
    {
        int[] res=getIndexArray(new int[]{-1,3,5},8);
        System.out.println(res[0] + " " + res[1]);
    }


    //[-15,3] -12
    //
    public static int[] getIndexArray(int[] input, int target)
    {
        int[] result=new int[2];
        Map<Integer,Integer> mapResult=new HashMap<>();
        int key;
        for(int i=0;i<input.length;i++)
        {
            key=target-input[i];
            if(!mapResult.containsKey(key)) mapResult.put(input[i],i);
            else
            {
                result[0]=mapResult.get(key);
                result[1]=i;
                break;

            }
        }

        return result;
    }
}



