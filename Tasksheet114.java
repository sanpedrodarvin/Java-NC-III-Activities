public class Tasksheet114 {
    public static void main(String[] args) {
        int check_number = 10;
        String message;
        for (int c = 1; c < check_number + 1; c++)
        {
            message = (c%2==0) ? c + " is even number." : c + " is odd number.";
            System.out.println(message);
        }
    }
}
