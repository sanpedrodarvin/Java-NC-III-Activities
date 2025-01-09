import static java.lang.Math.*;
import java.util.Scanner;
public class Tasksheet121 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MathOperations math = new MathOperations();

        System.out.print("Enter input 1: ");
        int n1 = in.nextInt();
        System.out.print("Enter input 2: ");
        int n2 = in.nextInt();

        System.out.println(math.add(n1,n2));
        System.out.println(math.subtract(n1,n2));
        System.out.println(math.multiply(n1,n2));
        System.out.println(math.divide(n1,n2));

    }
}

class MathOperations
{
    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return Math.floorDiv(a, b);
    }
}
