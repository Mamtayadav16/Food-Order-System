import java.util.ArrayList;
import java.util.Scanner;

public class bill {
    double dc;

    public void b(ArrayList<product> ob, int[][] arr, int s, ArrayList<cup> obj1) {
        ArrayList<product> obj = new ArrayList<product>();
        for (int i = 0; i < s; i++) {
            int a = arr[i][0];
            int q = arr[i][1];
            for (product o1 : ob) {
                if (o1.id == a) {
                    String Item_Name = o1.Item_Name;
                    int price = o1.price;
                    product m = new product(a, Item_Name, price, q); // id name, price quantity
                    obj.add(m);
                }
            }
        }
        System.out.println("\nYou're order\n");
        System.out.println(" ID | Price | Qty |\tItem\n");
        for (product ele : obj) {
            System.out.println(" "+ele.id +"\t"+ele.price +"\t" +ele.quantity+"    "+ele.Item_Name);
        }
        double amount = 0;
        for (product ele : obj) {
            amount = amount + (ele.price * ele.quantity);
        }
        bill_display(amount, obj1);
    }

    void bill_display(double amount, ArrayList<cup> obj1) {
        System.out.println("Total : " + amount);
        SortCupon s=new SortCupon();
        s.cupons(amount, obj1);
        System.out.print("Enter your coupon code: ");
        Scanner sc1 = new Scanner(System.in);
        String coup = sc1.next();
        System.out.println("Coupon code entered by you is:" + coup);
        sc1.close();
        dc=discount(coup);
        System.out.println("You get a discount of " + dc + "%");
        dc=dc/100;
        double Final = amount - (dc* amount);
        System.out.println("After adding discount your amount is: " + Final);
        System.out.println("Thank You for ordering...");
    }
    public double discount(String coupon) 
    {
        if (coupon.equals("SUPER"))
            dc = 2;
        else if (coupon.equals("DIGIS"))
            dc = 10;
        else if (coupon.equals("SLICE"))
            dc = 80;
        else if (coupon.equals("SIMPE"))
            dc = 5;
        else if (coupon.equals("SWETI"))
            dc = 51;
        else if (coupon.equals("RETUI"))
            dc = 50;
        else if (coupon.equals("GFGTT"))
            dc = 40;
        else if (coupon.equals("EEGHG"))
            dc = 20;
        else if (coupon.equals("TYUIO"))
            dc = 25;
        else if (coupon.equals("ERRYY"))
            dc = 70;
        return(dc);
    }
}
