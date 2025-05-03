import java.util.Scanner;
class rectangle
{
  public int len,wid;
  Scanner sc = new Scanner(System.in);
  public void input()
  {
     System.out.print("Enter Length: ");
     len = sc.nextInt();
     System.out.print("Enter Width: ");
     wid = sc.nextInt();
  }
  public void show()
  {
    System.out.println("Area of Rectangle is: "+(len*wid));
   }
}
class cuboid extends rectangle
{
   private int hei;
   public void input()
   {
      super.input();
      System.out.print("Enter Height: ");
      hei = sc.nextInt();
   }
   public void show()
   {
      System.out.print("Area of Cuboid is: "+(2*(len*wid+len*hei+wid*hei)));
   }
}
public class area
{
   public static void main(String args[])
   {
      rectangle r = new rectangle();
      cuboid c = new cuboid();
      r.input();
      r.show();
      c.input();
      c.show();
   }
}
