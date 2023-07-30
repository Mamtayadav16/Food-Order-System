import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class project 
{
    public static void main(String args[]) throws FileNotFoundException,IOException
    { 
        
        ArrayList<product> obj = new ArrayList<product>();
        File F=new File("project.txt");
        BufferedReader io=new BufferedReader(new FileReader(F));
        String Item_Name;
        int price,quantity,id;
        String str;
        Scanner sc=new Scanner(System.in);

        ArrayList<cup> obj1 = new ArrayList<cup>();
        File F1=new File("coupon.txt");
        BufferedReader ioc=new BufferedReader(new FileReader(F1));
        int id_no;
        String code;
        int dis;
        try
        {
          System.out.println(" Menu ");
          System.out.println("Id Item Name \t  price : ");
            while( (str=io.readLine()) !=null )
            {
                String []ssplit= str.split(",");
                id=Integer.parseInt(ssplit[0]);
                Item_Name=ssplit[1];
                price=Integer.parseInt(ssplit[2]);
                System.out.println(" "+id +"\t"+Item_Name +"\t\t\t" + price + "\t" );
                product i=new product(id,Item_Name,price,0);
                obj.add(i);
            }
            while( (str=ioc.readLine()) !=null )
            {
                String []ssplit= str.split(",");
                id_no=Integer.parseInt(ssplit[0]);
                code=ssplit[1];
                dis=Integer.parseInt(ssplit[2]);
                //System.out.println( id_no + " " + code + dis);
                cup i=new cup(id_no,code,dis);
                obj1.add(i);
            }
            System.out.println("Please enter you'r order : ");
            System.out.print("Please enter how many elements you want to order : ");
            int s=sc.nextInt();
            System.out.println("enter the order numbers and the quantity : ");
            int arr[][]=new int[s][2];
            for(int j=0; j < s; j++)
            {
                int order_no=sc.nextInt();
                quantity=sc.nextInt();
                arr[j][0]=order_no;
                arr[j][1]=quantity;
            }
            bill x=new bill();
            x.b(obj, arr,s,obj1);
            sc.close();
        }
        catch(FileNotFoundException E)
        {
            System.out.println(" ");
        }
        catch(EOFException E)
        {
            System.out.println(" ");
        }
        catch(IOException E)
        {
            System.out.println(" ");
        }
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}

