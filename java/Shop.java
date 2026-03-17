import java.util.Scanner;

interface Calc {
    void calculate();
}

class Bill implements Calc {
    String pid, pname;
    int quantity;
    double price, total, amount = 0;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.println("Enter product details");
        System.out.println("=====================================");
        System.out.print("Product id: ");
        pid = sc.nextLine();
        System.out.print("Product name: ");
        pname = sc.nextLine();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();
        System.out.print("Price: ");
        price = sc.nextDouble();
    }

    public void calculate() {
        total = quantity * price;
    }

    public void display() {
        System.out.println(pid + "\t" + pname + "\t" + quantity + "\t" + price + "\t" + total);
    }
}

public class Shop {
    public static void main(String[] args) {
        int n, i, order_no;
        double namount = 0;
        String date;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Bill details");
        System.out.println("====================================");
        System.out.print("Order No: ");
        order_no = s.nextInt();
        System.out.print("Date: ");
        date = s.next();
        System.out.println("No.of products: ");
        n = s.nextInt();
        Bill ob[] = new Bill[n];
        for (i = 0; i < n; i++)
            ob[i] = new Bill();
        for (i = 0; i < n; i++) {
            ob[i].getdata();
            ob[i].calculate();
        }
        System.out.println("Order No: " + order_no);
        System.out.println("Date: " + date);
        System.out.println("Productid Name Qunatity Umitprice Total");
        System.out.println("===================================");
        for (i = 0; i < n; i++) {
            ob[i].display();
            ;
            namount += ob[i].total;
        }
        System.out.println(" ");
        System.out.println("\t\t\tNet amount\t" + namount);
    }
}
