class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {

        if(strarr.length==0|| k>strarr.length || k<=0) return "";
        // your code

        int start=0;
        int lengthSubString=0;
        StringBuilder conceSubString=new StringBuilder();
        String result="";
        while(start<=strarr.length-k)
        {
            for(int j=0;j<k;j++)
            {
                conceSubString.append(strarr[start+j]);

            }
            if(conceSubString.length()>lengthSubString) {
                result = conceSubString.toString();
                lengthSubString = conceSubString.length();
            }
            conceSubString.setLength(0);
            start++;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
    }
}