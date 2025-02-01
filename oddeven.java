import java.util.Scanner;

public class oddeven
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num;
        String res;
        System.out.print("Enter a number:");
        num = sc.nextInt();
        res=(num%2==0)?"Even":"Odd";
        System.out.println("Number is "+res);
    }
}
