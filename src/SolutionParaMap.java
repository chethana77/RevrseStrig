import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SolutionParaMap {

    public static void main(String[] args)
    {
        System.out.println(validPara("[])"));

    }

    public static boolean validPara(String bracesString)
    {
        Map<Character,Character>  stringHash=new HashMap<>();
        stringHash.put(']','[');
        stringHash.put('}','{');
        stringHash.put(')','(');
        Stack<Character> stack=new Stack<>();

        for(int pointer=0;pointer<bracesString.length();pointer++)
        {
            char param=bracesString.charAt(pointer);
            if(stringHash.containsKey(param)) {
                if (stack.empty() || !stringHash.get(param).equals(stack.pop()))

                    return false;
            }
            else
                {
                    stack.push(param);
            }

        }

        if(!stack.empty()) return  false;

        return true;
    }

}
