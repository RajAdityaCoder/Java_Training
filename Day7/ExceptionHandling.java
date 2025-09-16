
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            int c = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } finally {
            System.out.println(c);
        }
    }
}
