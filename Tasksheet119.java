import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Tasksheet119 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tasksheet119 calculator = new Tasksheet119();
        double num1, num2;

        System.out.print("Enter first number: ");
        num1 = in.nextDouble();

        System.out.print("Enter second number: ");
        num2 = in.nextDouble();

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }

    public double add(double num1, double num2)
    {
        return num1 + num2;
    }

    public double subtract(double num1, double num2)
    {
        return num1 - num2;
    }

    public double multiply(double num1, double num2)
    {
        return num1 * num2;
    }

    public double divide(double num1, double num2)
    {
        return num1 / num2;
    }

}
