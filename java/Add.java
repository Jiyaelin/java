import java.util.Scanner;

public class Add {
    void sum(double a) {
        System.out.println("\nSum:" + a + "+" + a + "=" + (a + a));
    }

    void sum(int a, int b) {
        System.out.println("\nSum of 2 nos.:" + a + "+" + b + "=" + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("\nSum of 3 nos.:" + a + "+" + b + "+" + c + "=" + (a + b + c));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter a double data type value");
        double n1 = s.nextDouble();
        System.out.println("Enter 3 integers");
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();
        Add ob = new Add();
        ob.sum(n1);
        ob.sum(n2, n3);
        ob.sum(n2, n3, n4);
    }
}
