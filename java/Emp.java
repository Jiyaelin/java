import java.util.Scanner;
public class Emp
{
    int empno;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Employee Name:");
        name=scan.nextLine();
        System.out.println("\n\nEnter Emp No:");
        empno=scan.nextInt();
    }
    void display()
    {
        System.out.println("\nEmployee Name:"+name);
        System.out.println("Employee No:"+empno);
    }
    public static void main(String args[]) 
    {
            Emp e=new Emp();
            System.out.println("\n\nEmployee Details");
            System.out.println("\n\n------------------");
            e.getData();
            e.display();
    
    }
}