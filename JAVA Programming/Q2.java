//input the side of a square. Find the area of the square.
import java.util.*;

public class Q2 {
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side of a Square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of a Square is:"+area);
    }
}