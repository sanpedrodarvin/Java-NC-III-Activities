public class Taskheet129 {
    public static void main(String[] args) {

    }
}

class Gorilla implements Animal
{
    @Override
    public boolean feed(boolean timeToEat) {
        //put gorilla food into cage
        return timeToEat;
    }

    @Override
    public void pet() { /*pet at your own risk */ }

    @Override
    public void groom() { /*lather, rinse, repeat*/ }

}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

