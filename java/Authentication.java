import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        String username = "Ashish";
        String password = "@Ashish123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username");
        String u1 = sc.nextLine();
        System.out.println("Enter the Password");
        String p1 = sc.nextLine();
        try {
            if ((u1.equals(username)) && (p1.equals(password))) {
                System.out.println("Access Granted");
            } else {
                throw new CredentialException("Invalid Credentials");
            }
        } catch (CredentialException e) {
            System.out.println(e.getMessage());
        }
    }
}
