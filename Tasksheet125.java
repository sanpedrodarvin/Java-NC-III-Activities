public class Tasksheet125 {
    public static void main(String[] args) {
        Vehicle camry = new Car("Toyota", "Camry", 2022, 4);
        camry.displayDetails();
    }
}

class Vehicle {
    protected String make, model;
    protected int year;

    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public void displayDetails()
    {
        System.out.println("Car Details: \n" +
                "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year);
    }

}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car (String make, String model, int year, int numberOfDoors)
    {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}
