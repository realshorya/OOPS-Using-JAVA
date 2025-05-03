class time
{
   private int hour,min,sec;
   public time()
   {
      hour=11;
      min=59;
      sec=59;
   }
   public time(int x,int y,int z)
   {
      hour=x;
      min=y;
      sec=z;
   }
   public void show()
   {
      System.out.println("Time is: "+hour+":"+min+":"+sec);
   }
   public int gethour()
   {
      System.out.println(hour);
      return hour;
    }
   public void sethour(int x)
   {
     hour=x;
    }
}
class wakt
{
  public static void main(String args[])
  {
    time t = new time();
    t.show();
    time t1 = new time(12,00,00);
    t1.show();
    t1.gethour();
    t.sethour(10);
    t.show();
   }
}
