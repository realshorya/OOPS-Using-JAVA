import java.util.Scanner;
class Array
{
  public static void main(String argv[])
   {
     Scanner sc = new Scanner(System.in);
     int a[];
     int i;
     a = new int[5];
     System.out.print("Enter 5 Array numbers: ");
     for(i=0;i<5;i++)
     {
      a[i]=sc.nextInt();
      }
     System.out.print("Entered Array Elements are: ");
     for(i=0;i<5;i++)
     {
      System.out.print(a[i]+" ");
      }
   }
}
