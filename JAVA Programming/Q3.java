/*Enter cost of 3 items(using float data type)-a pencil,a pen and an eraser.
Find the total cost of the items back to the user as their bill.*/
import java.util.*;

public class Q3 {
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost of a Pencil:");
        float cost1 = sc.nextFloat();
        System.out.print("Enter Cost of a Pen:");
        float cost2 = sc.nextFloat();
        System.out.print("Enter Cost of a Eraser:");
        float cost3 = sc.nextFloat();
        float total = cost1 + cost2 + cost3;
        System.out.println("------------------------------");
        System.out.println("Total Amount:"+total);
        float GST = total * 0.18f;
        System.out.println("18% GST in Total Cost:"+GST);
        total+=GST;
        System.out.println("Amount to be Paid:"+total);
        System.out.println("------------------------------");

    }
}
