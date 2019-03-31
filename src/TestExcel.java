public class TestExcel {

    public static void main(String[] args)
    {
        String s="AA";
    int res=0;
    for(int i=0;i<s.length();i++)
    {
        res=res*26 + s.charAt(i)-'A'+1;
    }
      System.out.println(res);
    }
}
