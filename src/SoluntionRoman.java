import java.util.HashMap;
import java.util.Map;

class SoluntionRoman {
    public static int romanToInt(String s) {
        Map<Character,Integer> symbolMap=new HashMap<>();
        symbolMap.put('I',1);
        symbolMap.put('V',5);
        symbolMap.put('X',10);
        symbolMap.put('L',50);
        symbolMap.put('C',100);
        symbolMap.put('D',500);
        symbolMap.put('M',1000);

        int prev=symbolMap.containsKey(s.charAt(s.length()-1))?symbolMap.get(s.charAt(s.length()-1)):0;
        int sum=prev;
        int currentValue=0;

        for(int i=s.length()-2;i>=0;i--)
        {
            currentValue=symbolMap.get(s.charAt(i));
            if(currentValue<prev)
            {
                sum=sum-currentValue;
            }
            else
                sum=sum+currentValue;
            prev=currentValue;
        }
        return sum;
    }
    public static void main(String[] args)
    {
       System.out.println(romanToInt("III"));
    }
}