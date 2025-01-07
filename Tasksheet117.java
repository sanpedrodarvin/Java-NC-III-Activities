public class Tasksheet117 {
    public static void main(String[] args) {
        int[] n = new int[3];
        for(int i = 0; i < args.length; i++)
            n[i] = Integer.parseInt(args[i]);

        if (n[0] == n[1])
            if(n[1] == n[2])
                System.out.println("All numbers are equal");
        if(n[0] > n[1])
        {
            if(n[0] > n[2])
                System.out.println(n[0]);
            else if(n[2] > n[0])
                System.out.println(n[2]);
        }
        else if(n[1] > n[2])
            System.out.println(n[1]);
        else if(n[2] > n[1])
            System.out.println(n[2]);






    }
}
