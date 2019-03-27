public class meetingRoom {

    public static Interval n1;
    public static Interval n2;
    public static Interval n3,n4,n5;

    public static void main(String[] args)
    {
        /*n2=new Interval(0,30);
        n1=new Interval(5,10);
        n3=new Interval(10,20);*/

       /* n2=new Interval(5,10);
        n3=new Interval(1,4);
*/
       /* n1=new Interval(13,15);
        n2=new Interval(1,13);
        n3=new Interval(6,9);*/

       n1=new Interval(16,22);
       n2=new Interval(28,45);
       n3=new Interval(3,9);
       n4=new Interval(46,50);
       n5=new Interval(13,14);


        Interval[] list=new Interval[]{n1,n2,n3,n4,n5};
        System.out.println(valid(list));
    }

    public static boolean valid(Interval[] listInterval )
    {

        if(listInterval==null ) return  false;

        if(listInterval.length<=1) return true;

        int last_end=listInterval[0].end,last_start=listInterval[0].start;
        for(int i=1;i<listInterval.length;i++)
        {

            if(listInterval[i].end> last_start && listInterval[i].start<last_end)
            {
                return false;
            }
            else
            {
                last_end=last_end<listInterval[i].end?listInterval[i].end:last_end;
                last_start=last_start>listInterval[i].start?listInterval[i].start:last_start;

            }


        }
        return  true;

    }

}

