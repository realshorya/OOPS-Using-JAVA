import java.util.*;
class exception
{
    public static void main(String args[])
    {
          int a=0,b=0,c;
          try
          {
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter First Number:");
              a = sc.nextInt();
              System.out.print("Enter Second Number:");
              b = sc.nextInt();
              c=a+b;
              System.out.println("Sum is "+c);
              c=a-b;
              System.out.println("Difference is "+c);
              c=a/b;
              System.out.println("Division is "+c);
          }
          catch(ArithmeticException ae)
          {
              System.out.println("Division by Zero is not Possible");
          }
          catch(InputMismatchException io)
          {
              System.out.println("Entering Characters is not Supported");
          }
          catch(Exception e)
          {
              System.out.println("Contact Developer");
          }
          finally
          {
              c=a*b;
              System.out.println("Multiplication is "+c);
          }
    }
}
