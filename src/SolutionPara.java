import java.util.Stack;

public class SolutionPara {
    public static boolean isValid(String s) {

        Stack<Character> stack=new Stack<Character>();
        char[] ch=s.toCharArray();
        int top=0;
        char stackChar;
        //push char
        for(int i=0;i<ch.length;i++)
        {
            stackChar=ch[i];
            if(stackChar==')' ||stackChar=='}' || stackChar ==']')
            {
                //pop from stack and check
                if(!stack.empty())
                {
                    char poppeditem=stack.pop();
                    if(stackChar==')' && poppeditem!='(')  return false;
                    else if(stackChar=='}' && poppeditem!='{') return false;
                    else if(stackChar==']' && poppeditem!='[') return  false;

                }
                else{
                    if(top==0) return false;
                }
            }

            else if(stackChar=='(' ||stackChar=='{' || stackChar =='[')
            {stack.push(stackChar);
                top++;}

        }
         if (!stack.empty()) return false;
        return true;


    }

    public static void main(String[] args)
    {
       System.out.println(isValid("[{]"));
    }

}