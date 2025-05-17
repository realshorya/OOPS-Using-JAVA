import java.util.*;
class OverFlowException extends Exception
{
     public String toString()
     {
          return "Stack is Full";
     }
}
class UnderFlowException extends Exception
{
     public String toString()
     {
          return "Stack is Empty";
     }
}
class Stack
{
     private int data[];
     private int top;
     private final int MAX=10;
     public Stack()
     {
          top=-1;
          data = new int[MAX];
     }
     public void push(int val)throws OverFlowException
     {
          if(top==MAX-1)
               throw new OverFlowException();

          else
          {
               top++;
               data[top]=val;
          }
     }
     public int pop()throws UnderFlowException
     {
          int val=0;
          if(top==-1)
               throw new UnderFlowException();

          else
          {
               val=data[top--];
               return val;
          }
     }
}
class stackEx
{
     public static void main(String args[])
     {
          try{
          Stack s = new Stack();
          s.push(45);
          s.push(67);
          System.out.println(s.pop());
          System.out.println(s.pop());
          System.out.println(s.pop());}
          catch(Exception  e)
          {
               System.out.println(e.toString());
          }
     }
}
