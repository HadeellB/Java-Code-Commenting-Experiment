public class C01_OperatorPrecedence {
    public static void main(String[] args) {
        // Multiplication takes precedence over addition: 5 * 2 is evaluated first, giving 20.
        int result = 10 + 5 * 2;
        System.out.println("10+5*2=" + result);

        // Parentheses make addition happen first: (10 + 5) is evaluated before multiplication, giving 30.
        int result2 = (10 + 5) * 2;
        System.out.println("(10+5)*2=" + result2);
    }
}