public class Tasksheet120
{
    public static void main(String[] args) {
        System.out.println(Tasksheet120.getTotal(args));
    }

    public static int getTotal(String... numbers)
    {
        int total = 0;
        for(String n : numbers)
            total += Integer.parseInt(n);
        return  total;
    }

}
