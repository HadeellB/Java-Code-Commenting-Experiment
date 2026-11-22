public class C06_DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;
        String binary = "";

        // Handle zero explicitly because the loop only processes positive numbers.
        if (num == 0) {
            binary = "0";
        }

        // Repeatedly divide by 2 to extract the binary digits.
        while (num > 0) {
            int rem = num % 2;
            // Prepend each remainder to place the digits in the correct order.
            binary = rem + binary;
            num = num / 2;
        }
        System.out.println("Binary: " + binary);
    }
}