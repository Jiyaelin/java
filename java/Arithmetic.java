import java.util.Scanner;
import pkgOperations.*;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second number:");
        int b = sc.nextInt();
        Add ob1 = new Add();
        Subtract ob2 = new Subtract();
        Multiply ob3 = new Multiply();
        Divide ob4 = new Divide();
        ob1.cal(a,b);
        ob2.cal(a, b);
        ob3.cal(a, b);
        ob4.cal(a, b);

    }

}
