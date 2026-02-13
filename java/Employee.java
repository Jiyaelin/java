import java.util.Scanner;

public class Employee {
    int empid, TA, DA, HRA, Tax, basic, netsal;
    String empname;

    void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employeeid, Employee name, TA, DA, HRA, Tax, basic");

        empid = scan.nextInt();
        scan.nextLine();         
        empname = scan.nextLine();
        TA = scan.nextInt();
        DA = scan.nextInt();
        HRA = scan.nextInt();
        Tax = scan.nextInt();
        basic = scan.nextInt();
    }

    void calc() {
        netsal = (basic + TA + DA + HRA) - Tax;
        System.out.println("Net Salary: " + netsal);
    }

    public static void main(String args[]) {
        Employee e = new Employee();
        e.getData();
        System.out.println("\n\nEmployee Details\n");
        System.out.println("-----------------");
        System.out.println("Employee name: " + e.empname);
        System.out.println("Employee id: " + e.empid);
        e.calc();
    }
}
