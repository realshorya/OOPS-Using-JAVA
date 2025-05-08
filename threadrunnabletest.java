class Message implements Runnable
{
     private int n;
     private String msg;
     Thread t;
     public Message(int x,String y)
     {
          n=x;
          msg=y;
          t= new Thread(this);
     }
     public void start()
     {
          t.start();
     }
     public void run()
     {
          try{
          for(int i=1;i<=n;i++)
          {
              System.out.println(msg+" "+i);
              Thread.sleep(200);
          }}
          catch(Exception e)
          {
          }
     }
}
class threadrunnabletest.java
{
     public static void main(String args[])
     {
          Message m1 = new Message(8,"OOOOO");
          Message m2 = new Message(12,"XXXXX");
          try{
          m1.start();
          m2.start();
          for(int i=1;i<=10;i++)
          {
              System.out.println("[][][][] "+i);
              Thread.sleep(200);
          }}
          catch(Exception e)
          {
          }
     }
}           
