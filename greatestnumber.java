import java.util.Scanner;

public class greatestnumber
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,res;
        System.out.print("Enter First Number:");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number:");
        num2 = sc.nextInt();
        System.out.print("Enter Third Number:");
        num3 = sc.nextInt();
        
        if(num1>num2 && num1>num3)
        res=num1;
        else if(num2>num1 && num2>num3)
        res=num2;
        else
        res=num3;
        System.out.println("Greatest Number is: "+res);
        
        
    }
}
