import java.util.Comparator;

public class Sort implements Comparator<cup>
{
    public int compare(cup o1,cup o2)
    {
        if(o1.dis<o2.dis)
            return 1;
        else if(o1.dis>o2.dis)
            return -1;
        else 
            return 0;       
    }
}