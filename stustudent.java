import java.util.Scanner;
class Student
{
    private String name;
    private int admno,marks;
    static private int pass_mark;
    static Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.print("Enter Admission Number: ");
        admno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }
    public void show()
    {
        System.out.println("Admission no."+admno+" Student Name: "+name+" Marks Obtained:"+marks);
    }
    public void result()
    {
        if(marks>=pass_mark)
        {
            System.out.println("Student is Pass");
        }
        else
        {
            System.out.println("OOPS Fail");
        }
    }
    public static void passmark()
    {
        System.out.print("Enter Passing Marks:");
        pass_mark = sc.nextInt();
    }
}
class stustudent
{
    public static void main(String args[])
    {
         Student s = new Student();
         Student.passmark();
         s.input();
         s.show();
         s.result();
         Student r = new Student();
         r.input();
         r.show();
         r.result();
    }
}
