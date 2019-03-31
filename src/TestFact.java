public class TestFact {

    public static void main(String[] args)
    {
       System.out.println(trailing(1808548329));
    }

    public static int trailing(int input)
    {
        int rem=0;
       while(input>0)
       {
           rem+=input%5;
           input=input/5;
       }

       return rem;
    }
    public static int trailingZeroes(int n) {
        int factN = fact(n);
        int cnt = 0;
        while (factN >= 9) {
            if (factN % 10 == 0) cnt++;
            factN = factN / 10;
        }
        return cnt;
    }
    public static int fact(int n){
        if(n==0) return 1;
        return n * fact(n-1);
    }
}
