import java.util.Scanner;
public class square
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num, res;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        res = num * num;
        System.out.println("Square is:"+res);
    }
}
