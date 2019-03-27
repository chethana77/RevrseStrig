import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        Solution sln=new Solution();
        System.out.println("yes" + sln.IsPalindrome(A,sln.RevString(A)));
        /* Enter your code here. Print output to STDOUT. */
    }

    boolean IsPalindrome(String inString,String outString)
    {
        return inString.equals(outString) ? true:false;
    }
    String RevString(String inString)
    {
        StringBuilder sb=new StringBuilder(inString);
        int n=inString.length();
        int j=n-1;
        char tempch;
        for(int i=0;i>n/2;i++)
        {
            tempch=sb.charAt(i);

            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,tempch);

        }
        return inString;
    }
}