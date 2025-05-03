interface car
{
  void favorite();
  void fun();
}

class mclaren implements car
{
  public void favorite()
   {
      System.out.println("Mclaren SENNA");
   }
  public void fun()
  {
   
   }
}

class lambho implements car
{
  public void favorite()
   {
      System.out.println("Lambhorghini Ures");
   }
public void fun()
  {
   
   }

}
public class consider
{
  public static void main(String args[])
   {
     mclaren m = new mclaren();
      m.favorite();
    
     lambho l = new lambho();
      l.favorite();
   }
}
