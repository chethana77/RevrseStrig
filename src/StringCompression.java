class StringCompression {
    public static void main (String[] args) {
        System.out.println("aabbad => a2b2a1d1");

        System.out.println(getCharCount("aabbad"));


    }


    public static String getCharCount(String input)
    {
        if(input ==null && input.length()==0) return "";
        char[] arr=input.toCharArray();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            count++;
            if((i+1>=arr.length)|| (arr[i]!=arr[i+1]) )
           // if((arr[i]!=arr[i+1]) )
            {
                System.out.println(arr[i]);
                sb.append(arr[i] + String.valueOf(count ));
                count=0;
            }

        }
        return sb.toString();
    }
}
