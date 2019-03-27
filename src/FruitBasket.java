import java.util.HashMap;
import java.util.Map;

public class FruitBasket {


    public static void main(String[] args) {

       int result= totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4});
        System.out.println("result=" + result);
    }

    public static int totalFruit(int[] tree) {

        if(tree==null)
            return 0;
        if(tree.length==0)
            return 0;

        int max=1;
        Map<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;

        while(j<tree.length)
        {
            if(map.size()<=2)
            map.put(tree[j],j++);

            if(map.size()>2)
            {
                int min=tree.length-1;
                for(int value:map.values())
                {
                    min=Math.min(min,value);
                }
                i=min+1;
                map.remove(tree[min]);

            }

            max=Math.max(max,j-i);
        }

        return  max;

    }

}