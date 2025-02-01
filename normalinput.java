import java.util.Scanner;
public class normalinput
{
    public static void main (String[] args)
    {
        System.out.println("Hello World!");
        System.out.print("Enter Two Numbers:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int tum=sc.nextInt();
        System.out.println("Entered number is "+num+" And "+tum);
    }
}
