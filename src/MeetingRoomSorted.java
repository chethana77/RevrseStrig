import java.util.Arrays;

public class MeetingRoomSorted {

    public static Interval n1;
    public static Interval n2;
    public static Interval n3,n4,n5;

    public static void main(String[] args)
    {
        /*n2=new Interval(0,30);
        n1=new Interval(5,10);
        n3=new Interval(10,20);*/

        n2=new Interval(5,10);
        n3=new Interval(1,4);
      /*  n1=new Interval(13,15);
        n2=new Interval(1,13);
        n3=new Interval(6,9);*/

       /* n1=new Interval(16,22);
        n2=new Interval(28,45);
        n3=new Interval(3,9);
        n4=new Interval(46,50);
        n5=new Interval(13,14);*/


//        Interval[] list=new Interval[]{n1,n2,n3,n4,n5};
        //Interval[] list=new Interval[]{n1,n2,n3};
        Interval[] list=new Interval[]{n2,n3};
        System.out.println(valid(list));
    }

    public static boolean valid(Interval[] listInterval )
    {
        int[] starts=new int[listInterval.length];
        int[] ends=new int[listInterval.length];


        for(int i=0;i<listInterval.length;i++)
        {
            starts[i]=listInterval[i].start;
            ends[i]=listInterval[i].end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        for(int i=0;i<starts.length-1;i++)
        {
            if(starts[i+1]<ends[i]) return false;
        }

        return true;
    }
}
