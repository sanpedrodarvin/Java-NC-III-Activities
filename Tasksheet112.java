public class Tasksheet112 {
        public static void main(String[] args) {
            char[] c = {'H', 'w', 'r', 'd'};
            int i = 3110;
            byte b = 0;
            short s = 1;
            float f = 2.0f;
            boolean bool = true;


            String output = c[0] + "" + i + " " + c[1] + b + c[2] + s + c[3] + " " + f + " " + bool;
            // or replace c[0] + "" with String.valueOf(c[0])
            System.out.println(output);
    }
}
