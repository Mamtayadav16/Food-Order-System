import java.util.ArrayList;
import java.util.Collections;

public class SortCupon  
{
    public void cupons(double amount, ArrayList <cup> obj1) 
    {
        ArrayList<cup> obj = new ArrayList<cup>();
        if(amount >=400)
        {
            for(cup o: obj1)
            {
                if(o.dis>=75)
                {
                    cup m = new cup(o.id_no,o.code,o.dis);   
                    obj.add(m);
                }    
            }
        }
        else if(amount>=300)
        {
            for(cup o: obj1)
            {
                if(o.dis<75 & o.dis>=50)
                {
                    cup m = new cup(o.id_no,o.code,o.dis);   
                    obj.add(m);
                }    
            }
        }
        else if(amount>=250)
        {
            for(cup o: obj1)
            {
                if(o.dis<50 & o.dis>=30)
                {
                    cup m = new cup(o.id_no,o.code,o.dis);   
                    obj.add(m);
                }    
            }
        }
        else if(amount>=200)
        {
            for(cup o: obj1)
            {
                if(o.dis<30 & o.dis>=20)
                {
                    cup m = new cup(o.id_no,o.code,o.dis);   
                    obj.add(m);
                }    
            }
        }
        else if(amount>=100)
        {
            for(cup o: obj1)
            {
                if(o.dis<20 & o.dis>=15)
                {
                    cup m = new cup(o.id_no,o.code,o.dis);   
                    obj.add(m);
                }    
            }
        }
        else if (amount >= 50 )
        {
            for(cup o: obj1)
            {
                if(o.dis<15)
                {
                    cup m = new cup(o.id_no,o.code,o.dis);   
                    obj.add(m);
                }    
            }
        }
        Collections.sort(obj,new Sort());
        System.out.println( "available discounts on your bill is :") ;
        for(cup o: obj)
        {
            System.out.println( o.id_no + " " + o.code + " " + o.dis ); 
        }
    }
}
