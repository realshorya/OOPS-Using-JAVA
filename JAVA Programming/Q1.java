//input 3 numbers: A, B and C. Find average of these 3 numbers.
import java.util.*;

public class Q1{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number A:");
        int num1 = sc.nextInt();
        System.out.print("Enter Number B:");
        int num2 = sc.nextInt();
        System.out.print("Enter Number C:");
        int num3 = sc.nextInt();
        int total=num1+num2+num3;
        float avg = (float)total/3;
        System.out.println("Average of 3 Numbers are:"+avg);
    }
}