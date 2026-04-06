import java.util.Scanner;

class Multiplication extends Thread {
    @Override
    public void run() {
        System.out.println("Multiplication table of 5: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x 5= " + i * 5);
        }
        System.out.println("Exiting from thread Multiplication.....");
    }
}

class EvenNumbers extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Even nos.upto " + n);
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "is a Even number");
            }
        }
        sc.close();
    }
}

public class ThreadClass {
    public static void main(String args[]) {
        Multiplication a = new Multiplication();
        EvenNumbers b = new EvenNumbers();
        a.start();
        b.start();
    }
}
