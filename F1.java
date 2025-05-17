import java.io.*;
import java.util.*;
class F1 
{
    public static void main(String args[])
    {
         try
         {
             FileOutputStream f = new FileOutputStream("Story.txt");
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter a String to write in File:");
             String a = sc.nextLine();
             for(int i=0;i<a.length();i++)
             {
                  f.write(a.charAt(i));
             }
             f.close();
         }
         catch(FileNotFoundException ae)
         {
             System.out.println("File not Found");
         }
         catch(IOException io)
         {
             System.out.println("IO Exception");
         }
         catch(Exception e)
         {
         }
    }
}
