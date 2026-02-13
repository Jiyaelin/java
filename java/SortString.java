import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String strElement;
        System.out.println("Enter the number of strings:");
        int n = s.nextInt();
        String str[] = new String[n];
        System.out.println("Enter the Strings:");
        for (int i = 0; i < n; i++) {
            str[i] = s.next();
        }
        Arrays.sort(str);
        System.out.println("\nSorted Strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
        s.close();
    }
}
