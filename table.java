import java.util.Scanner;
class table
{
 public static void main(String argv[])
  {
   Scanner sc = new Scanner(System.in);
   int i,num,sum;
   System.out.print("Enter Number: ");
   num = sc.nextInt();
   for(i=1;i<=10;i++)
    {
        sum=num*i;
        System.out.println(num+" X "+i+" = "+sum);
     }
   }
 }
   
