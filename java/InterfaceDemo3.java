import java.util.Scanner;

interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class InterfaceDemo3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1. Circle");
            System.out.println("2. Recatangle");
            System.out.println("3.Exit");
            System.out.println("Choose an option(1-3):");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter radius of circle: ");
                    double r = s.nextDouble();
                    Circle ob1 = new Circle(r);
                    System.out.println("Area: " + ob1.area());
                    System.out.println("Perimeter: " + ob1.perimeter());
                    break;

                case 2:
                    System.out.println("Enter length of rectangle:");
                    double l = s.nextDouble();
                    System.out.println("Enter width of rectangle:");
                    double w = s.nextDouble();
                    Rectangle ob2 = new Rectangle(l, w);
                    System.out.println("Arae of Rectangle: " + ob2.area());
                    System.out.println("Perimeter of Rectangle: " + ob2.perimeter());
                    break;

                case 3:
                    System.out.println("Existing........");
                    s.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option.please try again");
                    break;
            }
        }
    }

}
