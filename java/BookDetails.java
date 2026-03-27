import java.util.Scanner;

class Publisher {
    String pubName;

    Publisher(String pub) {
        pubName = pub;
    }
}

class Book extends Publisher {
    String book;

    Book(String pub, String bk) {
        super(pub);
        book = bk;
    }
}

class Literature extends Book {
    String category;

    Literature(String pub, String bk, String ctgry) {
        super(pub, bk);
        category = ctgry;
    }

    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Bokk: " + book);
        System.out.println("Category: " + category);
    }
}

class Fiction extends Book {
    String category;

    Fiction(String pub, String bk, String ctgry) {
        super(pub, bk);
        category = ctgry;
    }

    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Book: " + book);
        System.out.println("Category: " + category);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Literature Book Details");
        System.out.println("Book Name");
        String b = s.next();
        s.nextLine();
        System.out.println("Publisher");
        String pub = s.next();
        s.nextLine();
        System.out.println("Category");
        String c = s.next();
        s.nextLine();
        Literature ob1 = new Literature(b, pub, c);

        System.out.println("");
        System.out.println("Enter Fiction Book Details");
        System.out.println("Book Name");
        String b1 = s.next();
        s.nextLine();
        System.out.println("Publisher");
        String p1 = s.next();
        s.nextLine();
        System.out.println("Category");
        String c1 = s.next();
        s.nextLine();
        Fiction ob2 = new Fiction(b1, p1, c1);
        System.out.println("\n***Literature Book***");
        System.out.println("----------------------------------------");
        ob1.display();
        System.out.println("\n***Fiction Book");
        System.out.println("------------------------------------------");
        ob2.display();
        s.close();

    }
}
