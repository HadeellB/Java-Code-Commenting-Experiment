import java.util.Scanner;

public class C18_DefangIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        // Read the address as a whitespace-delimited token.
        String address = sc.next();

        // Defang the address by replacing every literal dot with "[.]".
        String result = address.replace(".", "[.]");

        System.out.println("Defanged IP address: " + result);
        sc.close();
    }
}