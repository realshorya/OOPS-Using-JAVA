import java.util.Scanner;
class prime4
{
 public static void main(String argv[])
 {
   Scanner sc = new Scanner(System.in);
   int num,i,count=0;
   System.out.print("Enter Number: ");
   num = sc.nextInt();
   for(i=2;i<=num;i++)
   {
     if(num%i==0)
     {
       count++;
      }
    }
   if(count==1)
    {
       System.out.print(num+" IS PRIME");
     }
   else
    System.out.print(num+" IS NOT A PRIME NUMBER");
  }
}
   
