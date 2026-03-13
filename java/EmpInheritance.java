import java.util.Scanner;

class Employee {
    int empid;
    String name, address;
    double salary;

    Employee(int no, String na, String addr, double sal) {
        empid = no;
        name = na;
        address = addr;
        salary = sal;
    }
}

class Teacher extends Employee {
    String dept, subject;

    Teacher(int no, String na, String addr, double sal, String dep, String sub) {
        super(no, na, addr, sal);
        dept = dep;
        subject = sub;
    }

    void display() {
        System.out.println("Employee id: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + subject);
    }
}

public class EmpInheritance {
    public static void main(String args[]) {
        System.out.println("\nEnter the no.of Employees");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Teacher arr[] = new Teacher[num];
        for (int i = 0; i < num; i++) {
            System.out.println(
                    "\nEnter Employee" + (i + 1) + "details:id,Employee Name,Address,Salary,Department,Subject");
            int empid = s.nextInt();
            String name = s.next();
            String address = s.next();
            double salary = s.nextDouble();
            String dept = s.next();
            String subject = s.next();
            arr[i] = new Teacher(empid, name, address, salary, dept, subject);
        }
        System.out.println("\n** Information of all employee's **");
        for (int i = 0; i < num; i++) {
            System.out.println("\nEmployee-" + (i + 1) + "details");
            System.out.println("---------------------------------");
            arr[i].display();
        }
        s.close();
    }

}
